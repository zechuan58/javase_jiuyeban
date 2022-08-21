package com.practice.day7_demo;

import java.util.Arrays;

/*
        1.定义一个字符串数组
        	Integer[] arr = {123,456,777,345,345,222,999,222,110,120,567};
        3.对元素按照降序排列（可以使用流的sort方法，虽然我没讲，但是我相信你会用的）
        4.截取前面8个
        5.跳过前面3个
        6.去除重复元素
        7.过滤保留偶数元素
        8.遍历打印剩余元素

学习小技巧：调用完一个方法之后使用forEach测试一下，看是否和目标项目，这样可以加深印象。
 */
public class IntegerStreamTest {
    public static void main(String[] args) {
        Integer[] arr = {123, 456, 777, 345, 345, 222, 999, 222, 110, 120, 567};
        Arrays.stream(arr)
                .sorted((o1, o2) -> o2 - o1)
                .limit(8)
                .skip(3)
                .distinct()
                .filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.println(integer));
    }
}
