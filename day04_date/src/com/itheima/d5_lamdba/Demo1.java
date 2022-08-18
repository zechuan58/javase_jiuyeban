package com.itheima.d5_lamdba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
Lambda表达式的由来：
    因为匿名内部类的写法比较复杂，所以为了简化匿名内部类的书写，就有了Lamdba表达式。
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer[] array = {30, 20, 10, 50, 40};

        //需求:使用Arrays工具类对array进行择序,按照从大到小的顺序排序
       /* Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(array));//[50, 40, 30, 20, 10]*/

        //用lambda表达式
        Arrays.sort(array, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(array));//[50, 40, 30, 20, 10]

        System.out.println("-------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历集合:forEach中需要一个Consumer接口,它是一个函数式接口
        list.forEach(s -> System.out.println(s));
    }
}
