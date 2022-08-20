package com.itheima.d2_list;

/*
List集合特有方法
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo1 {
    public static void main(String[] args) {
        //需求:往ArrayList集合中依次添加:孙悟空,猪八戒,沙和尚,小白龙,小白龙
        //把最后一个元素改为唐僧,再将最后一个元素置顶

        //往ArrayList集合中依次添加:孙悟空,猪八戒,沙和尚,小白龙,小白龙
        ArrayList<String> list = new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("小白龙");
        list.add("小白龙");

        //把最后一个元素改为唐僧
        list.set(list.size() - 1, "唐僧");
        //System.out.println(list);

        //再将最后一个元素置顶
        String e = list.remove(list.size() - 1);
        list.add(0, e);

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list);

        System.out.println("--------------------");

        //往LinkedList集合中依次添加:孙悟空,猪八戒,沙和尚,小白龙,小白龙
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("孙悟空");
        list1.add("猪八戒");
        list1.add("沙和尚");
        list1.add("小白龙");
        list1.add("小白龙");

        //把最后一个元素改为唐僧
        list1.set(list1.size() - 1, "唐僧");
        //System.out.println(list);

        //再将最后一个元素置顶
        String e1 = list1.remove(list1.size() - 1);
        list1.add(0, e1);

        for (String s1 : list) {
            System.out.println(s1);
        }
        System.out.println(list1);
    }
}
