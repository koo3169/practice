package com.test.kootest.kootest.temp;

import android.util.Log;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapTest {
    public static void main(String[] args) {
        mapWrapper();
    }

    public static void mapWrapper(){
        Map<String, String> map = new HashMap<>();
        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");
        map.put("d","ddd");

        for(Map.Entry<String,String> entry : map.entrySet()){
            Log.e("kooj", entry.getKey()+", "+entry.getValue());
        }

        for(String key:map.keySet()){
            String value = map.get(key);
            Log.e("kooj", key+", "+value);
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = (Map.Entry<String,String>) iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
        }
    }
}
