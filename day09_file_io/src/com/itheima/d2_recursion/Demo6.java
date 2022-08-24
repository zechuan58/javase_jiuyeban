package com.itheima.d2_recursion;

import java.io.File;

/**
 * 需求：删除文件夹
 */
public class Demo6 {
    public static void main(String[] args) {
        deleteDirectory(new File("C:\\Users\\11959\\Desktop\\ceshi"));
    }

    /**
     * 删除指定的文件夹
     * @param dir  要删除的文件夹
     */
    public static void deleteDirectory(File dir){
        //获取到文件夹中的内容
        File[] files = dir.listFiles();
        for (File file : files) {
            //如果file是文件，直接删除
            if(file.isFile()){
                file.delete();
            }else {
                //如果file是文件夹，那就删除file文件夹中的内容
                deleteDirectory(file);
            }
        }
        //前面的for循环，删除的dir文件夹中的内容。等for循环结束了，dir文件夹就空的
        dir.delete();
    }
}
