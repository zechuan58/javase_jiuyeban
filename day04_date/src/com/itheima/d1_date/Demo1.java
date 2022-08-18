package com.itheima.d1_date;
/*
需求：计算出当前时间，往后走1小时26分之后的时间是多少？
思路：
   1)获取当前时间的毫秒值
   2)把当前时间的毫秒值往后+1小时26分(单位毫秒，统一单位)
   3)把新的毫秒值设置给Date对象
   4)打印Date对象即可
 */


import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        time += 1 * 60 * 60 * 1000 + 26 * 60 * 1000;
        date.setTime(time);

        System.out.println("新的时间:"+date);

    }
}
