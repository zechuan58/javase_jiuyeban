package com.itheima.d1_file;

import java.io.File;

/**
 * 目标： 绝对路径和相对路径
 * 1.绝对路径：从盘符开始的路径
 * 2.相对路径：从项目的根目录开始的路径
 *           【注意：只有你表示的文件或者文件夹在项目的根目录下，才能写相对路径】
 */
public class Demo2 {
    public static void main(String[] args) {
        //绝对路径
        File f1 = new File("C:\\IdeaProjects\\JavaSE_code\\day09_file_io\\a.txt");
        System.out.println(f1);

        //相对路径
        //项目的根目录：C:\IdeaProjects\JavaSE_code\
        File f2 = new File("day09_file_io\\a.txt");
        System.out.println(f2.getAbsolutePath());
    }
}
