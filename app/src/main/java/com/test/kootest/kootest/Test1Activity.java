package com.test.kootest.kootest;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.test.kootest.kootest.Service.TService;
import com.test.kootest.kootest.item.BusItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// AsyncTask 테스트
public class Test1Activity extends Activity implements View.OnClickListener {

    private String TAG = "Test1Activity";
    private TService tService;
    private boolean isBind;

    private TextView tv1, tv2, tv3, tv4, tv5;

    private BusItem busItem;

    private GenericTest2 gt;
    private GenericTest<String> stringT = new GenericTest<>();
    private GenericTest<Integer> integerT = new GenericTest<>();
    private GenericTest<ArrayList> arrayListT = new GenericTest<>();
    private GenericTest<HashMap> hashMapT = new GenericTest<>();

    public static Context mContext;

    ServiceConnection sConn = new ServiceConnection() {
        @Override   // 서비스가 실행될 때 호출
        public void onServiceConnected(ComponentName name, IBinder service) {
            TService.TBinder tBinder = (TService.TBinder)service;
            tService = tBinder.getService();
            isBind = true;
            Log.v(TAG,"onServiceConnected()");
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            tService = null;
            isBind = false;
            Log.v(TAG,"onServiceDisconnected()");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        mContext = this;

        tv1 = (TextView) findViewById(R.id.sv_start);
        tv2 = (TextView) findViewById(R.id.sv_stop);
        tv3 = (TextView) findViewById(R.id.sv_bind);
        tv4 = (TextView) findViewById(R.id.sv_unbind);
        tv5 = (TextView) findViewById(R.id.sv_call_var);

        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);

        busItem = new BusItem();
        busItem.setAveTime("a");
        busItem.setBusLocationCd("b");
        busItem.setBusLocationName("d");
        busItem.setCustCd("d");

        gt = new GenericTest2();

        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product());
        list.add(new Act());
        list.add(new Bct());

        Product p = list.get(0);
        Act a = (Act)list.get(1);

        List<String> list1 = new ArrayList<>();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sv_start:
                startService(new Intent(Test1Activity.this, TService.class));   // 서비스 시작
                gt.showType(1);
                integerT.sample = 1;
                integerT.showType();
                break;
            case R.id.sv_stop:
                stopService(new Intent(Test1Activity.this, TService.class));   // 서비스 종료
                gt.showType("abc");
                stringT.sample = "abc";
                stringT.showType();
                break;
            case R.id.sv_bind:
                if(!isBind && tService == null){
                    bindService(new Intent(Test1Activity.this, TService.class),sConn,BIND_AUTO_CREATE);   // 바운딩 시작
                }
                gt.showType(new ArrayList<String>());
                arrayListT.sample = new ArrayList<String>();
                arrayListT.showType();
                break;
            case R.id.sv_unbind:
                tv5.setText("0");
                gt.showType(busItem);
                hashMapT.sample = new HashMap<BusItem, String>();
                hashMapT.showType();
                break;
            case R.id.sv_call_var:
                if(tService == null){
                    Toast.makeText(this,"호출실패",Toast.LENGTH_SHORT).show();
                }else if(tService != null){
                    tv5.setText(""+tService.var);
                }
                break;
        }
    }
    // 와일드 카드 방식1
    public static void printAll_1(ArrayList<? extends Product> list){
        for(Product p : list){
            System.out.println(p);
        }
    }
    // 와일드 카드 방식2
    public static <T extends Product> void printAll_2(ArrayList<T> list){
        for(Product p : list){
            System.out.println(p);
        }
    }
}

class GenericTest<T>{
    public T sample;

    public void showType(){
        if(sample instanceof Integer){
            Log.e("kooj", "숫자");
        }else if(sample instanceof String){
            Log.e("kooj", "문자");
        }else if(sample instanceof ArrayList){
            Log.e("kooj", "배열");
        }else if(sample instanceof HashMap){
            Log.e("kooj", "해시맵");
        }else if(sample instanceof BusItem){
            Test1Activity.mContext.startActivity(new Intent(Test1Activity.mContext, LocationInfoActivity.class));
        }
    }
}

class GenericTest2<T>{
    public T sample;

    public void showType(Object object){
        sample = (T)object;

        if(sample instanceof Integer){
            Log.e("kooj", "Integer");
        }else if(sample instanceof String){
            Log.e("kooj", "String");
        }else if(sample instanceof ArrayList){
            Log.e("kooj", "ArrayList");
        }else if(sample instanceof HashMap){
            Log.e("kooj", "HashMap");
        }else if(sample instanceof BusItem){
            Test1Activity.mContext.startActivity(new Intent(Test1Activity.mContext, LocationInfoActivity.class));
        }
    }
}

class Product{};
class Act extends Product{};
class Bct extends Product{};