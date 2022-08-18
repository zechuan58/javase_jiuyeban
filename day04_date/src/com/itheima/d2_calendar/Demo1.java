package com.itheima.d2_calendar;

import java.util.Calendar;

/*
目标：学习Calendar类的使用，通过Calendar可以对任何一个日历字段进行一些操作(获取、计算、设置)
    public int get(int field)
        获取指定日历字段的值，日历字段使用一个整数表示。
    public void set(int field, int value)
        修改指定日历字段的值，日历字段使用一个整数表示。
    public void add(int field, int value)
        修改指定日历字段的值，日历字段使用一个整数表示。
 */
public class Demo1 {
    public static void main(String[] args) {

        //获取Calender类的对象
        Calendar calendar = Calendar.getInstance();
        /*int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");*/

        //调用设置年,月,日的方法
        //设置年月日为2099年8月1日
        calendar.set(Calendar.YEAR, 2099);//设置年
        calendar.set(Calendar.MONTH,7);//设置月--月份从0开始,0代表1月
        calendar.set(Calendar.DAY_OF_MONTH, 1);//设置日
        /*calendar.set(Calendar.HOUR,1);//设置小时
        calendar.set(Calendar.MINUTE,59);//设置分钟
        calendar.set(Calendar.SECOND,59);//设置秒*/

        //计算日历字段的值
        calendar.add(Calendar.YEAR, -99);//减99年
        calendar.add(Calendar.MONTH, 2);//加2个月
        calendar.add(Calendar.DAY_OF_MONTH, 10);//加10天


        //获取日历字段的值
        int year = calendar.get(Calendar.YEAR);

        //0代表1月,1代表2月
        int month = calendar.get(Calendar.MONTH) ;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        //int hour=calendar.get(Calendar.HOUR);
        System.out.println(year + "年" + month + "月" + day + "日");

        System.out.println(calendar.get(Calendar.HOUR));//获取小时
        System.out.println(calendar.get(Calendar.MINUTE));//获取分钟
        System.out.println(calendar.get(Calendar.SECOND));//获取秒
    }
}
