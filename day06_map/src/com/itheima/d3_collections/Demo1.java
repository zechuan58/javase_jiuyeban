package com.itheima.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //批量添加4个元素
        Collections.addAll(list, "aaa", "ccc", "ddd", "bbb");

        //把集合中的元素打乱
        Collections.shuffle(list);

        //对集合中的元素排序(默认是升序排列)
        //Collections.sort(list);
        //System.out.println(list);

        //对集合中的元素按照指定的比较器排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);



    }
}
