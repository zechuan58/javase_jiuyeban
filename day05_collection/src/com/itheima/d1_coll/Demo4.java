package com.itheima.d1_coll;

import java.util.ArrayList;

/*
目标：演示迭代器遍历集合或者增强for遍历集合可能存在的问题（了解）
 */
public class Demo4 {
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
