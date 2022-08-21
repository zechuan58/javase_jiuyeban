package com.itheima.d5_map;


import java.util.HashMap;

/*
map集合的遍历方式3：forEach方法
    JDK8以后才有的，结合lambda表达式一起使用
 */
public class Demo5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("陈奕迅", "十年");
        map.put("周杰伦", "稻香");
        map.put("林俊杰", "浪漫血液");
        map.put("李荣浩", "不搭");

        //JDK8以后使用
        map.forEach((key, value) -> System.out.println(key + "..." + value));
    }
}
