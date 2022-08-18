package com.itheima.d3_arithmetic;

import java.util.Arrays;

/*
二分查找核心思路： 首先要求元素从小到大排序，每次查找中间位置的元素
    第一步：确定开始和结束的索引
            int start = 0;
            int end = 长度-1;
    第二步：找到start和end中间的索引位置
            int mid = (start+end)/2;
    第三步：把mid索引位置的元素和目标元素进行比较
            比目标元素大：end=mid-1
            比目标元素小：start=mid+1
            和目标元素相同：找到了，mid就是要找的索引
    需要把第二步和第三步循环执行，直到找到为止
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //查找3元素在array数组中的索引位置
        int index = getIndex(array, 1);
        //Arrays工具类binarySearch方法二分查找
        //int index = Arrays.binarySearch(array, 1);
        System.out.println(index);
    }


    /**
     * 查找数组中指定元素的索引位置
     *
     * @param array 要查找的数组
     * @param key   要查找的元素
     * @return 返回元素的索引
     */
    public static int getIndex(int[] array, int key) {
        //第一步：确定开始和结束的索引
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            //第二步：找到start和end中间的索引位置
            int mid = (start + end) / 2;

            //第三步：把mid索引位置的元素和目标元素进行比较
            if (array[mid] > key) {
                //比目标元素大：end=mid-1
                end = mid - 1;
            } else if (array[mid] < key) {
                //比目标元素小：start=mid+1
                start = mid + 1;
            } else {
                return mid; //如果找到了，mid就是要找的索引
            }
        }
        return -1; //没有找到
    }

}
