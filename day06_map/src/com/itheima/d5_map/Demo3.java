package com.itheima.d5_map;


import java.util.HashMap;
import java.util.Set;

/*
Map集合的遍历方式一：keySet()方法
    第一步：调用keySet()方法，得到所有的键组成的Set集合
    第二步：遍历Set集合，获取到每一个键
    第三部：通过get方法获取键对应的值
 */
public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("蔡徐坤", "小黑子");
        map.put("吴亦凡", "小牙签");
        map.put("123", "456");

        //获取所有的键,把所有的键存入一个set集合并返回
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value=map.get(key);
            System.out.println(key+"..."+value);
        }
    }
}
