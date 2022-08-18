package com.itheima.homework.demo03;
/*
测试类
 */
public class Test03 {

    public static void main(String[] args) {
        Phone p = new Phone("小米", 4999);
        System.out.println("品牌：" + p.getBrand());
        System.out.println("价格：" + p.getPrice());
        System.out.println("尺寸：" + p.getSize());
        System.out.println("----------------");
        Phone p1=new Phone("iPhone 13",6999,5);
        System.out.println("品牌：" + p1.getBrand());
        System.out.println("价格：" + p1.getPrice());
        System.out.println("尺寸：" + p1.getSize());

    }
}


