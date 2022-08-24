package com.itheima.exception;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("键盘录入一个价格:");
                double price = sc.nextDouble();
                if (price >= 0) {
                    System.out.println("是一个合法的价格");
                    break;
                } else {
                    System.out.println("价格不能是负数");
                }
            } catch (Exception e) {
                System.out.println("你录入的数据格式不对");
            }
        }
    }

    /*public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }*/
}
