package com.itheima.d1_coll;

import java.util.ArrayList;
import java.util.Iterator;

/*
目标：使用迭代器遍历Collection集合
 */
public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("武松");
        list.add("武大郎");
        list.add("西门庆");
        list.add("潘金莲");

        //获取迭代器对象Iterator
        Iterator<String> iterable=list.iterator();

        //判断集合是否为空,遍历集合
        while ((iterable.hasNext())){
            String s=iterable.next();
            System.out.println(s);
        }


    }
}
