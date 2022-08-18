package com.itheima.d3_arithmetic;

import java.util.Arrays;

/*
冒泡排序核心思想： 把相邻的两个元素两两比较，小的往前放，大的往后放
排序的规律：
    1.每一轮是从0开始，把相邻的两个元素进行比较
        索引：j和j+1
    2.比较的轮数是长度-1
    3.每一轮比较的次数比上一轮要少一次
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] array = {5,3,1,4};
        sort(array);
        //Arrays.sort(array);
        //打印数组中的元素
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        //System.out.println(Arrays.toString(array));
    }

    /**
     * 对int数组进行排序
     * @param array  要排序的数组
     */
    public static void sort(int[] array){
        //比较的轮数：要比长度少一次
        for (int i = 0; i < array.length-1; i++) {
            //每一轮比较的次数：比上一轮少一次
            //-1的目标：为了防止索引越界
            //-i的目标：为了每一轮比较的次数比上一轮少一次
            for (int j = 0; j < array.length-1-i; j++) {
                //把相邻的两个元素比较，索引：j和j+1
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}
