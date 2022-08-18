package com.itheima.d1_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//需求：计算出"2021年08月06日11点11分11秒”，往后走2天14小时后的时间是多少？"

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        //第一步：把"2021年08月06日11点11分11秒“转换为Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日hh点mm分ss秒");
        Date date = sdf.parse("2021年08月06日11点11分11秒");

        //第二步：获取Date对象的毫秒值
        long time = date.getTime();

        //第三步：把毫秒值往后+2天14小时
        time += 2 * 24 * 60 * 60 * 1000 + 14 * 60 * 60 * 1000;

        //第四步：把新的毫秒值设置给Date对象
        date.setTime(time);

        //第五步：再把Date对象格式化为日期字符串
        String str = sdf.format(date);
        System.out.println(str);
    }
}
