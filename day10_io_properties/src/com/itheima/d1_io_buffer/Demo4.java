package com.itheima.d1_io_buffer;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 目标：把csb.txt文件的内容,恢复顺序,写到csb2.txt文件中
 * <p>
 * 分析:
 * 1)可以把csb.txt文件中的每一行先读取出来
 * 2)把每一行用一个集合存起来,选择用ArrayList集合
 * 3)使用Collections工具类的sort方法,对Arraylist集合排序
 * 4)再遍历ArrayList集合,把排序后的每一行,逐行写入csb2.txt
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        //把csb.txt文件中的每一行先读取出来
        BufferedReader br = new BufferedReader(new FileReader("day10_io_properties\\csb.txt"));

        ArrayList<String> list = new ArrayList<>();
        String line;//记录每次读取的一行
        while ((line = br.readLine()) != null) {
            //把每一行用一个集合存起来,选择用ArrayList集合
            list.add(line);
        }
        br.close();

        //把所有汉子序号,用一个集合存起来
        ArrayList<String> orders = new ArrayList<>();
        Collections.addAll(orders, "一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");

        //使用Collections工具类的sort方法,对Arraylist集合排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //o1和o2表示集合中需要比较的两个字符串
                //假设：o1: 十一.出师未捷身先死，长使英雄泪满襟。
                //假设：o2: 九.今当远离，临表涕零，不知所言。
                //获取o1点前面的字符
                String s1 = o1.split("\\.")[0];
                //获取o2点前面的字符
                String s2 = o2.split("\\.")[0];

                //找到s1和s2在前面orders集合中的索引位置
                int index1 = orders.indexOf(s1);
                int index2 = orders.indexOf(s2);

                return index1 - index2;
            }
        });

        //把List集合中的每一行,再写如到csb3.txt文件中去
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_io_properties\\csb3.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
            //bw.flush();//刷新
        }
        bw.close();
    }

}