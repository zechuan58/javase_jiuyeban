package com.itheima.d6_api_system;

/*
System类：提供了一些通用的功能，任何地方都可以直接使用类名调用。 不能实例化
 */
public class Demo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("Hello");
            if (i==9999){
                System.exit(0);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
