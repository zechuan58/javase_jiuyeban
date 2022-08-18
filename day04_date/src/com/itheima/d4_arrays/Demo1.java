package com.itheima.d4_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/*
目标：使用Arrays类对数组进行排序、查找等操作
 */
public class Demo1 {
    public static void main(String[] args) {
        Integer[] arr = {6, 9, 8, 2, 5, 4, 7, 1, 3};

        //1.默认排序(升序):对数组进行排序
        Arrays.sort(arr);
        //打印数组
        System.out.println(Arrays.toString(arr));
/*
sort方法底层会自动调用Comparator对象的compare方法,把比较的元素传递给01和02
        我们只需要比较01和02谁大谁小就行: 01-02升序 02-01降序
        以01-02升序排列为例:
            如果compare方法返回正数就说明01比02大, 会自动把01放在02后面
            如果compare方法返回负数就说明01比02小,会自动把01放在02的前面
            如果compare方法返回0就说明01和02相等,会自动并排放以02-01
        降序排列为例:
            如果compare方法返回正数就说明01比02大, 会自动把01放在02后面
            如果compare方法返回负数就说明01比02小, 会自动把01放在02的前面
            如果compare方法返回0就说明01和02相等,会自动并排放
 */
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //打印数组
        System.out.println(Arrays.toString(arr));
    }
}
