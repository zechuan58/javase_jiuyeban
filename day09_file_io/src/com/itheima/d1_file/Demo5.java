package com.itheima.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * 目标：遍历文件夹的API方法
 * public File[] listFiles()
 *
 * 注意事项：
 *      1)必须是一个文件夹的对象来调用listFiles方法, 否则结果为null
 *      2)如果是一个空文件夹，调用listFiles方法，得到一个空的数组(数组的长度为0)
 *      3)当你遍历文件夹时，有些文件夹时没有权限访问的，这时会返回null.
 */
public class Demo5 {
    public static void main(String[] args) {
        //准备一个文件夹路径
        File f = new File("C:\\resources");

        //遍历文件夹，获取文件夹中的一级内容
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println("------------");
        String[] files1=f.list();
        for (String s : files1) {
            System.out.println(s);
        }
    }
}
