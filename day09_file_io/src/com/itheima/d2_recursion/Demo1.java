package com.itheima.d2_recursion;


/**
 * 目标：递归的形式和特点
 *
 * 递归形式： 所谓递归就是方法自己调用自己
 * 注意：递归一定要有出口，否则就会出现栈内存溢出
 */
public class Demo1 {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        System.out.println("helloworld");
        show();
    }
}
