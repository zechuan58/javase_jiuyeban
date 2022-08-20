package com.practice.day6_demo;

import java.util.HashSet;

/**
 * Phone测试类
 */
public class PhoneTest {
    public static void main(String[] args) {
        HashSet<Phone> set = new HashSet<>();
        set.add(new Phone("Iphone", 5499));
        set.add(new Phone("VIVO", 3499));
        set.add(new Phone("OPPO", 2499));
        set.add(new Phone("OPPO", 2499));

        for (Phone phone : set) {
            System.out.println(phone);
        }
    }
}
