package com.itheima.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
编译时异常,编译时就会提供报错,必须进行处理才可以继续执行
    声明异常(抛出异常):throws异常类
        声明异常,其实只是告诉调用者,方法中可能有异常,但是并没有真正的处理异常

 */
public class Demo6 {
    public static void main(String[] args) {
        //键盘录入一个字符串,然后解析这个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("键盘录入一个生日:");
        String birthday = sc.nextLine();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(birthday);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("你录入的日期不对,无法解析!");
        }
    }
}
