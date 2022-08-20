package com.itheima.d1_generic.demo5;


import java.util.Arrays;
import java.util.Comparator;

public class Demo5 {
    public static void main(String[] args) {
        Integer[] array = {4, 5, 2, 1, 3};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(array));

        System.out.println("================");


        String[] array1 = {"hellojava", "world", "java", "hh"};
        Arrays.sort(array1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.toString(array1));
    }

}
