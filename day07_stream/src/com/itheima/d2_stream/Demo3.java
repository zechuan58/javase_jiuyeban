package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
  获取Stream流
  1)单列集合获取流
        Stream<元素类型> s = 集合.stream();

  2)双列集合获取流
        Stream<键型> S1 = map. keySet().stream();
        Stream<值类型> s2 = map.values().stream();
        Stream<键值对类型> s3 = map.entrySet().stream();

   3)数组流获取流
        Stream<元素类型> s4 = Stream.of(元素1,元素2,元素3);

 */
public class Demo3 {
    public static void main(String[] args) {
        //准备一个单列集合
        ArrayList<String> list = new ArrayList<>();
        //给list集合添加元素
        Collections.addAll(list, "hello", "java", "world");

        //list集合获取流
        list.stream().forEach(s -> System.out.println(s));
        System.out.println("-----------------");


        //2.Map集合获取流: 不能够直接获取,需要转换为单列集合才能获取流
        //键:姓名,值:年龄
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三", 18);
        map.put("李四", 20);
        map.put("王五", 19);
        //获取所有的键,再获取流
        map.keySet().stream().forEach(s -> System.out.println(s));
        System.out.println("-----------------");

        //获取所有的值,再获取流
        map.values().stream().forEach(s -> System.out.println(s));
        System.out.println("-----------------");

        //获取所有的键值对,再获取流
        map.entrySet().stream().forEach(s -> System.out.println(s));

    }
}
