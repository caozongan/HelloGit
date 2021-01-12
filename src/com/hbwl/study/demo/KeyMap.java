package com.hbwl.study.demo;

import java.util.ArrayList;
import java.util.Date;

public class KeyMap {
    public static void main(String[] args) { //快捷键 psvm
        System.out.println(); //快捷键 sout
        for (int i = 0; i <100 ; i++) { //快捷键 fori

        }
        //region Description
        //普通循环
        String [] arrs ={"aaa","bbb","ccc"};
        for (int j = 0; j <arrs.length ; j++) {
            System.out.println(arrs[j]);
        }
        System.out.println("-------------");
        //增强循环
        for (String arr : arrs) {//快捷键 arrs.for
                 System.out.println(arr);
        }
        ArrayList list =new ArrayList();
        //endregion

        Date date = new Date();

        System.out.println("aaa");// 提示代码块 Ctrl+Alt+t

        System.out.println("aaa");// 移动      Shift+Alt+下、上
        System.out.println("aaa");// 复制      Ctrl+d

    }
}
