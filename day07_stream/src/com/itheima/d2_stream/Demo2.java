package com.itheima.d2_stream;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张三丰");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");

        //把list集合中姓张的元素,存储到一个新集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        }

        //把list集合中姓张的元素,存储到一个新集合中
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length()==3){
                list3.add(s);
            }
        }
        System.out.println(list3);
    }
}

