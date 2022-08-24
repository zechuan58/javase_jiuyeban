package com.itheima.d2_recursion;


import java.io.File;

/**
 * 练习： 在指定文件夹下，指定名称的文件
 */
public class Demo5 {
    public static void main(String[] args) {

        searchFile(new File("D:\\heimashangkezl"),"Java");
    }

    /**
     * 搜索指定文件夹下指定名称的文件，打印输出
     * @param dir  要搜索的目标文件夹
     * @param name 要搜索的文件名称
     */
    public static void searchFile(File dir, String name){
        //1.遍历dir文件夹，获取到文件夹中的每一个File对象
        File[] files = dir.listFiles();
        for (File file : files) {
            //如果file是文件
            if(file.isFile()){
                //获取文件的名称，判断是否是想要的文件
                //举例：“美女2.jpg”.contains("美女")
                if(file.getName().contains(name)){
                    System.out.println(file);
                }
            }else {
                //如果file是文件夹，继续遍历file这个文件夹
                searchFile(file,name);
            }
        }
    }
}
