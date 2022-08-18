package com.itheima.d3_api_object;

public class Demo1 {
    public static void main(String[] args) {
        int a=10;
        //把基本数据类型转换为字符类型
        //把整数10转换为字符串"10"
        String s1=a+"";
        System.out.println(s1);

        //使用包装类.toString(基本数据类型)
        String s2=Integer.toString(123);
        String s3=Double.toString(3.14);
        String s4=Boolean.toString(true);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println("----------");
        int num1=Integer.parseInt("12345");
        System.out.println(num1);

        double num2=Double.parseDouble("63.9");
        System.out.println(num2);

    }
}
