package com.itheima.d2_variable_param;

/*
可变参数格式：
    //数据类型...变量名:  表示可变参数，可以接收多个指定类型的值
    public static void method(数据类型...变量名){

    }
可变参数的本质：是数组，当做数组用即可
 */
public class Demo1 {
    public static void main(String[] args) {
        int sum1 = sum(3, 4, 5);
        System.out.println(sum1);

        int sum2 = sum(3, 4, 5, 6, 6, 7, 8, 9, 10);
        System.out.println(sum2);
    }

    //int... arr： 表示可变参数，可以接收多个int类型的值
    public static int sum(int... arr){
        //这里的arr本质上是一个数组，多个参数就表示数组中的元素
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
