package com.itheima.d1_generic.demo1;

import java.util.ArrayList;

/*
目标： 演示ArrayList集合中使用泛型，来确定元素的数据类型
泛型的好处:
    1)在编译阶段起到限制数据类型的作用
    2)避免了对元素进行类型转换
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("hello");
        list.add("world");

        //这里不是String类型,被泛型限制
        //list.add(123);
        //list.add(4.56);


        for (Object o : list) {

        }


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
    }
}
