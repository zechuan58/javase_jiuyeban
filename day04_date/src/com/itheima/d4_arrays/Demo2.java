package com.itheima.d4_arrays;

import java.util.Arrays;

/*
二分查找要求：
    1)一定要保证元素是有顺序的，否则不能进行二分查找
    2)数组中的元素不能重复，如果重复不确定找到哪一个
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] array = {9,4,6,7,1,5,3,2,8};
        //先排序，再进行二分查找
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //查找array数组中4元素的索引
        int index = Arrays.binarySearch(array, 4);
        System.out.println(index);
    }
}
