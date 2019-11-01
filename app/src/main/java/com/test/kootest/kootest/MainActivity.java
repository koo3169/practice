package com.test.kootest.kootest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.test.kootest.kootest.interface1.inter1;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity implements inter1 {
    @BindViews({R.id.test_btn1, R.id.test_btn2, R.id.test_btn3, R.id.test_btn4, R.id.test_btn5})
    List<Button> aButtons;

    @BindView(R.id.butterknife)
    TextView butterknife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        butterknife.setText("Tofu with Cheese on a tortilla");

//        ButterKnife.apply(aButtons, View.ALPHA, 0.0f);
    }

    @OnClick({R.id.test_btn1, R.id.test_btn2, R.id.test_btn3, R.id.test_btn4, R.id.test_btn5})
    public void onAction(View view){
        switch (view.getId()){
            case R.id.test_btn1:
                startActivity(new Intent(MainActivity.this, Test1Activity.class));
                break;
            case R.id.test_btn2:

                break;
            case R.id.test_btn3:

                break;
            case R.id.test_btn4:

                break;
            case R.id.test_btn5:

                break;

        }
    }

    @Override
    public String getFood() {
        return null;
    }
}
