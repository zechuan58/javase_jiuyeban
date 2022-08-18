package com.practice.day4_demo;

import java.util.Arrays;

/*
需求 : 使用数组工具类Arrays完成下面的三个需求

- 对数组进行排序
- 查找数组中的元素
 */
public class ArraysDemo {
    public static void main(String[] args) {
        Integer[] array = {90, 70, 50, 60, 30, 10, 20, 40, 80};

        //1.打印数组中的元素
        String str = Arrays.toString(array);
        System.out.println(str);//[90, 70, 50, 60, 30, 10, 20, 40, 80]

        //对元素进行排序
        //2.1对数组的元素排序(默认升序排列)
        Arrays.sort(array);
        //2.2对数组的元素排序(手动排序规则)


        //3.查找数组中指定的元素索引
        //二分查找之前，必须对数组进行排序（升序）

    }
}
