package com.itheima.d1_coll;


import java.util.ArrayList;

/*
目标：使用forEach遍历集合，JDK8之后才有的
 */
public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("武松");
        list.add("武大郎");
        list.add("西门庆");
        list.add("潘金莲");

        //s表示数组元素
        list.forEach(s -> System.out.println(s));
    }
}
