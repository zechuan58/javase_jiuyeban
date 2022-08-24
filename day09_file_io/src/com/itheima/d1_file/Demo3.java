package com.itheima.d1_file;

//目标：File类的API方法，判断和获取功能演示

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * public boolean isDirectory()
 *      判断File对象封装的路径是否是文件夹路径
 *
 * public boolean isFile()
 *      判断File对象封装的路径是否是文件路径
 *
 * public boolean exists()
 *      判断File对象的路径是否存在
 *
 * public String getAbsolutePath()
 *      获取绝对路径
 *
 * public String getPath()
 *      获取路径，File对象封装的路径（可能是文件路径、也可能是文件夹路径、也可能是一个不存在的）
 *
 * public String getName()
 *      获取文件名  a.txt
 *
 * public long lastModified()
 *      获取文件最后一个修改的时间（单位：毫秒值）
 */
public class Demo3 {
    public static void main(String[] args) {
        //准备一个File对象，关联一个路径
        File f1 = new File("day09_file_io\\a.txt");

        //1.判断f1对象是否表示文件夹路径
        System.out.println(f1.isDirectory()); //false

        //2.判断f1对象是否表示文件路径
        System.out.println(f1.isFile()); //true

        //3.判断f1对象表示的路径是否存在
        System.out.println(f1.exists()); //true

        //4.获取f1对象的绝对路径
        System.out.println(f1.getAbsolutePath());

        //5.获取f1对象封装的路径
        System.out.println(f1.getPath());

        //6.获取文件或者文件夹的名称
        System.out.println(f1.getName());

        //7.获取文件或者文件夹最后一次修改的时间
        long time = f1.lastModified();
        //把毫秒值转换为日期
        Date date = new Date(time);
        //把Date再进行格式化，以yyyy年MM月dd日 HH:mm:ss格式打印输出
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String time2 = sdf.format(date);
        System.out.println(time2);

        System.out.println("--------------");
        File file3 = new File("day09_file_io\\b.txt");
        System.out.println(file3.length());

    }
}
