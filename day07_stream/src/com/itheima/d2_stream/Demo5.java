package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        //准备1个集合
        List<String> list1 = new ArrayList<>();

        //集合添加元素
        Collections.addAll(list1, "林冲", "鲁智深", "张青", "孙二娘", "武松", "武大郎", "潘金莲", "西门庆", "潘金莲");

        //count()方法是用来求个数
        long count = list1.stream().filter(s -> s.length() == 3).count ();
        System.out.println(count);
    }
}
