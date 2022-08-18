package com.practice.day4_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
需求1 :   使用Date类和SimpleDateFormat完成下面需求

        键盘录入你的生日字符串 （如：”1998年08月08日“）
        将生日字符串使用SimpleDateFormat解析为Date对象
        计算当前日期距离生日那天有多少天？
 */
public class Date_and_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日(如:\"1998年8月8日\")");
        String birthday = sc.next();
        //时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = sdf.parse(birthday);

        //获取生日毫秒值
        long birthdaytime = date.getTime();

        //获取当前时间毫秒值
        long currenttime = new Date().getTime();

        long day = (currenttime - birthdaytime) / 24 / 60 / 60 / 1000;
        System.out.println("你已经来到这个世界:" + day + "天了");

    }
}
