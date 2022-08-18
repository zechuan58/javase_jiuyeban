package com.itheima.d1_coll;

import java.util.ArrayList;

/*
目标：使用增强for遍历集合、或者数组
增强for的格式：
    for(元素类型 变量名 : 集合/数组){
        使用变量名，就表示每一个元素
    }
注意：增强for其实和迭代器本质上就是一个东西，只是从语法的角度简化了代码书写。
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("武松");
        list.add("武大郎");
        list.add("西门庆");
        list.add("潘金莲");

        //增强for循环
        //快捷键:集合名.for
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------");
        int[] array = {5, 4, 3, 2, 1};
        //快捷键:数组名.for
        for (int i : array) {
            System.out.println(i);
        }
    }
}
