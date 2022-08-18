package com.itheima.d5_api_math;

public class Demo12 {
    public static void main(String[] args) {
        //1.求一个数的绝对值
        System.out.println(Math.abs(10));  //10
        System.out.println(Math.abs(-10)); //10

        //2.对一个小数向上取整
        System.out.println(Math.ceil(6.1)); //7.0

        //3.对小数向下取整
        System.out.println(Math.floor(7.9)); //7.0

        //4.对小数四舍五入
        System.out.println(Math.round(3.5)); //4

        //5.获取两个数的最大值
        System.out.println(Math.max(8, 11)); //11

        //6.求一个数的几次幂
        System.out.println(Math.pow(2, 3)); // 2*2*2 = 8.0

        System.out.println("------------");
        //7.生产一个随机数 范围 [0.0, 1.0)
        double num = Math.random();
    }
}
