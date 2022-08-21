package com.practice.day6_demo;

import java.util.LinkedHashSet;

/**
 * 定义一个Phone类，有品牌brand，价格price两个属性
 * 选择合适的集合，往该集合一中添加3个Phone对象，要求元素不能重复，并且保证存取顺序
 * Phone测试类
 */
public class PhoneTest {
    public static void main(String[] args) {
        LinkedHashSet<Phone> set = new LinkedHashSet<>();
        set.add(new Phone("Iphone", 5499));
        set.add(new Phone("VIVO", 3499));
        set.add(new Phone("OPPO", 2499));
        set.add(new Phone("OPPO", 2499));

        for (Phone phone : set) {
            System.out.println(phone);
        }
    }
}
