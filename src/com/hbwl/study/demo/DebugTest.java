package com.hbwl.study.demo;

import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {
        System.out.println("----");
        int a =10;
        int b=11;
        int c= a+b;
        System.out.println(c);
        int [] arr ={1,2,34,55,6,7};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        HashMap<String,String> map =new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");
        String age = map.get("age");
        System.out.println("age="+age);
        map.remove("major");
        System.out.println(map);

    }
}
