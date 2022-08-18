package com.itheima.d1_coll;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

/*
需求： 往集合中添加3个电影对象
 */
public class Demo7 {
    public static void main(String[] args) throws ParseException {
        //创建集合存储电影对象
        ArrayList<Movie> list=new ArrayList<>();

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date date1=sdf.parse("1998年1月1日");
        Date date2=sdf.parse("1997年9月20日");
        Date date3=sdf.parse("2005年4月1日");

        Movie mv1 = new Movie("肖申克的救赎","蒂姆·罗宾斯",date1,"越狱");
        Movie mv2 = new Movie("霸王别姬","张国荣",date2,"爱情");
        Movie mv3 = new Movie("阿Q正传","汤姆·汉克斯",date3,"爱情");

        //把3个电影对象添加到集合中
        list.add(mv1);
        list.add(mv2);
        list.add(mv3);

        list.forEach(movie -> System.out.println(movie));
    }
}
