package com.itheima.d5_api_math;

public class Demo10 {
    public static void main(String[] args) {
        //1.求一个数的绝对值
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));

        System.out.println("--------------");

        //2.对一个小数向上取整
        System.out.println(Math.ceil(3.45));
        System.out.println(Math.ceil(3.88));
        System.out.println(Math.ceil(3.33));
        System.out.println(Math.ceil(3.01));

        System.out.println("--------------");

        //3.对小数向下取整
        System.out.println(Math.floor(3.99));
        System.out.println(Math.floor(4.49));
        System.out.println(Math.floor(5.59));
        System.out.println(Math.floor(6.69));

        System.out.println("--------------");

        //4.对小数四舍五入
        System.out.println(Math.round(3.45));
        System.out.println(Math.round(4.50));
        System.out.println(Math.round(5.49));
        System.out.println(Math.round(6.99));
        System.out.println(Math.round(7.40));

        System.out.println("--------------");

        //5.获取两个数的最大值
        System.out.println(Math.max(9, 80));

        System.out.println("--------------");

        //6.求一个数的几次幂
        System.out.println(Math.pow(2, 4));//16

        System.out.println("--------------");

        //7.生产一个随机数 范围 [0.0, 1.0)
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
    }
}
