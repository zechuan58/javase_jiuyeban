package com.itheima.d2_recursion;

/**
 * 目标：递归的执行流程，核心要素
 * 需求：求1~5的阶乘？ (ps:1~5的阶乘不一定都需要用递归来做，这里只是以此为例来学习递归的用法和特点)
 * <p>
 * 推导过程：
 * 假设 f(n)表示n以内的阶乘
 * f(1) = 1
 * f(2) = f(1)*2
 * f(3) = f(2)*3
 * f(4) = f(3)*4
 * f(5) = f(4)*5
 * ...
 * <p>
 * 总结规律：
 * 除了n=1, 阶乘为1
 * 其他的数字，f(n)= f(n-1)*n;
 */
public class Demo2 {
    public static void main(String[] args) {
        int result = f(5);
        System.out.println(result); //120
    }

    /**
     * 求n以内的阶乘
     *
     * @param n 指定求阶乘的范围
     * @return n以内阶乘的结果
     */
    /*public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return f(n-1)*n;
        }
    }*/


/*
1-5的和
 */
    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return f(n - 1) + n;
        }
    }
}
