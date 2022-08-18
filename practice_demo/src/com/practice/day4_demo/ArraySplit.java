package com.practice.day4_demo;

import java.util.Arrays;
import java.util.Scanner;

/*
需求 :  键盘录入字符串 "10 20 50 30 40" ，录入字符串用nextLine()方法。中间用空格隔开

- 查找String类的API找到split方法，使用该方法按照空格对字符串进行切割，得到一个字符串数组
- 遍历数组，把字符串数组中的每一个元素转换为int类型
- 再使用Arrays对int类型数组元素进行升序排列。
 */
public class ArraySplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:");
        String str = sc.nextLine();

        //创建一个String类型的数组,用split方法正则表达式去除空格
        String[] strarr = str.split(" ");

        //创建一个int类型的数组接收String类型数组转换后的数据,长度为String数组的长度
        int[] ints = new int[strarr.length];

        //遍历转换并存入数组
        for (int i = 0; i < strarr.length; i++) {
            String s = strarr[i];
            //把字符串转换为int
            int num = Integer.parseInt(s);
            ints[i] = num;
        }
        //使用Arrays中的sort方法进行升序排序
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
