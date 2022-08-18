package com.itheima.d3_static.demo2;

public class ArrayUtils {
    //打印数组中的元素
    public static void print(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i== array.length-1){
                System.out.println(array[i]+"]");
            }else{
                System.out.print(array[i]+",");
            }
        }
    }
}
