package com.itheima.d1_coll;

import java.util.ArrayList;
import java.util.Arrays;

/*
目标：学习Collection集合的常用方法
    public boolean add(E e)
        添加元素到集合的末尾

    public boolean remove(E e)
        删除集合中的元素

    public boolean contains(Object obj)
        判断集合是否包含给定的元素

    public boolean isEmpty()
        判断集合是否为空

    public int size()
        获取集合的长度

    public Object[] toArray()
        把集合转换为数组
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建集合
        //添加元素
        ArrayList<String> list =new ArrayList<>();
        list.add("Hello");
        list.add("java");
        list.add("Hello java");
        list.add("Hello world");
        list.add("你好 java");
        System.out.println(list);

        //删除"java"元素
        list.removeIf(s -> s.equals("java"));
        System.out.println(list);

        //判断集合是否包含给定的元素
        boolean contains = list.contains("Hello");
        System.out.println(contains);

        //清空元素
        //list.clear();

        //判断集合是否为空
        boolean empty = list.isEmpty();
        System.out.println(empty);

        //获取集合的长度
        int size = list.size();
        System.out.println("集合元素有:"+size);

        //把集合转换为数组
        Object[] toArray = list.toArray();
        System.out.println(Arrays.toString(toArray));
    }
}
