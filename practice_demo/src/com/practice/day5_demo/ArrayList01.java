package com.practice.day5_demo;

import java.util.ArrayList;
import java.util.Iterator;
/*
- 需求 :  往ArrayList添加以下元素”abc1”, ”abc2”, ”abc3”, ”abc4”.使用迭代器获取ArrayList集合中的元素
- 使用 4 种遍历方式,  对集合进行遍历
 */
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        //遍历1 增强for
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------");

        //遍历2 forEach
        list.forEach(s -> System.out.println(s));

        System.out.println("----------------");

        //遍历3 迭代器
        Iterator<String> iterator = list.iterator();
        while ((iterator.hasNext())) {
            String s = iterator.next();
            System.out.println(s);
        }

        System.out.println("----------------");

        //遍历4 for循环
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
