package com.itheima.d2_recursion;

/**
 *  练习：求斐波那契数列的第n个数是多少？
 *      1  1  2  3  5  8  13  21  34  55....
 *  分析数列的规律：
 *      1)第一个数和第二个数都是1，固定的
 *      2)从第3个数开始，每一个数等于前面两个数之和
 *
 *   假设：f(n)为斐波那契数列的第n个数
 *      f(1)=1
 *      f(2)=1
 *      f(3)=f(1)+f(2)
 *      f(4)=f(2)+f(3)
 *      ...
 *      f(n)=f(n-1)+f(n-2)
 */
public class Demo3 {
    public static void main(String[] args) {
        int num = f(10);
        System.out.println(num); //55
    }

    /**
     * 求斐波那契数列的第n个数是多少
     * @param n  第n个
     * @return 第n个数的值
     */
    public static int f(int n){
        if(n==1 || n==2){
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }
    }
}
