package com.itheima.d3_set;

import java.util.HashSet;

/*
目标：hashCode()方法的含义，获取一个哈希值(与地址值相关的整数)
    1.每一个对象都有不同的地址值，地址值不同那么哈希值就不同
    2.如果子类复写了hashCode方法，哈希值就和属性值相关，如果属性值一样那么哈希值就一样。
 */
public class Demo1 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("a你好");
        hs.add("b爪哇");
        hs.add("c世界");
        hs.add("d爪哇");

        System.out.println(hs);

    }
}
