package com.itheima.d5_map;


import java.util.HashMap;
import java.util.Scanner;

/*
键找值
练习：键盘录入一个字符串，求每一个字符出现的次数
 */
public class Demo2 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();


        HashMap<Character, Integer> map = new HashMap<>();
        //遍历字符串的每一个字符
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //判断是否包涵键(字符)
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                Integer value = map.get(ch);
                map.put(ch, value + 1);//新值覆盖旧值
            }
        }
        System.out.println(map);
    }
}
