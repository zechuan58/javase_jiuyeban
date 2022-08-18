package com.itheima.d1_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
目标：使用SimpleDateFormat类对日期时间进行格式化和解析
    第一步：创建SimpleDateFormat对象
            创建对象需要指定日期时间的模式(格式)，用一些字母表示
            常见的日期和时间的格式
                y   年
                M   月
                d   日
                H   小时
                m   分钟
                s   秒钟
            利用上面的字母拼接出想要的日期和时间的格式：举例（yyyy-MM-dd HH:mm:ss）

    第二步: 调用format或者parse完成格式化和解析
           格式化： Date对象 --> String
           解析：  String --> Date对象
 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //日期格式化:把Date转换为日期字符串
        //创建一个SimpleDateFormat对象,用于封装日期与时间格式
       SimpleDateFormat sim=new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");
        String str = sim.format(new Date());
        System.out.println(str);

        System.out.println("--------------");
        //日期解析:把日期字符串转换为Date对象
        String str2="2008年08月08日 08时08分08秒";
        SimpleDateFormat sim2=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=sim2.parse(str2);
        System.out.println(date);
    }
}
