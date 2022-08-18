package com.itheima.d2_calendar;

import java.util.Calendar;

public class Demo2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //一个星期的第一天是星期日
        int num=c.get(Calendar.DAY_OF_WEEK);
        String[] array={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        System.out.println(array[num]);
//        System.out.println(num);
    }
}
