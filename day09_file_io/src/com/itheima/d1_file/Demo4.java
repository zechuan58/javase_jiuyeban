package com.itheima.d1_file;

//目标：File类API方法，创建文件和文件夹

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * public boolean createNewFile()
 *      创建文件
 * public boolean mkdir()
 *      创建文件夹，只能创建单级文件夹
 * public boolean mkdirs()
 *      创建文件夹，可以创建多级文件夹
 *
 * public boolean delete()
 *      可以删除文件和空文件夹
 */
public class Demo4 {

    public static void main(String[] args) throws IOException {
        //准备一个File对象，关联一个文件路径
        File f1 = new File("day09_file_io\\a.txt");
        //1.创建f1对象所表示的文件， 如果文件不存在则创建成功；否则创建失败
        System.out.println(f1.createNewFile()); //true

        //2.创建文件夹, 如果文件夹不存在则创建成功；否则创建失败
        //File f2 = new File("day09_file_io\\abc\\bbc\\ccc");
        //System.out.println(f2.mkdirs());

        //3.删除文件、删除文件夹（只能是空的文件夹）
        File f3 = new File("day09_file_io\\b.txt");
        System.out.println(f3.delete());
    }
}
