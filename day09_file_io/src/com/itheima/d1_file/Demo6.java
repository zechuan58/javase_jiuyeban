package com.itheima.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * File类方法
 * 1)判断功能
 * isDirectory(): 判断是否是文件夹
 * isFile(): 判断是否是文件
 * exists(): 判断是否存在
 * <p>
 * 2)获取功能
 * getAbsoultePath(): 获取绝对路径
 * getPath():  获取File对象封装路径
 * lastModified(): 获取最后一次修改的时间（毫秒值）
 * getParent(): 获取父路径
 * <p>
 * 3)创建和删除
 * createNewFile(): 创建文件
 * mkdirs():  创建文件夹
 * <p>
 * 4)遍历功能
 * listFiles():  获取文件夹下的一级文件、文件夹的对象
 * 注意1：文件不能遍历，否则会得到一个null
 * 注意2：文件夹如果为空，会得到一个空的数组（数组长度为0）
 * 注意3：在系统盘上有些文件夹是没权限访问的，这时去遍历也会得到一个null
 */
public class Demo6 {
    public static void main(String[] args) {
        //准备一个文件夹
        File f = new File("C:\\Users\\11959\\Desktop");
        //获取文件夹下的所有一级内容
        File[] files = f.listFiles();
        //对files数组进行排序
        Arrays.sort(files, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o2.lastModified() - o1.lastModified() >= 0 ? 1 : -1;
            }
        });
        //遍历数组打印余数
        for (File file : files) {
            //获取最后一次修改的时间
            long time = file.lastModified();
            //对日期时间进行格式化
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str = sdf.format(new Date(time));

            System.out.println(str + "------" + file.getName());
        }
    }
}
