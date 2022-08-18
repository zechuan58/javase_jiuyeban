package com.practice.day5_demo;

import java.util.ArrayList;

/*
- 需求 : ArrayList有以下元素: "a","f","b","c","a","d"  对ArrayList集合去重
- 不允许使用 Set 集合 (因为是明天学的东西)
 */
public class ArrayContains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");

        //对集合中的元素去重
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            //如s元素再list2中不包含，添加到list2中
            if (!list2.contains(s)) {
                list2.add(s);
            }
        }
        System.out.println(list2);
    }
}
