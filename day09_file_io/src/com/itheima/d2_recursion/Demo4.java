package com.itheima.d2_recursion;

/**
 * 猴子吃桃问题：
 * 需求：猴子第一天摘下若干桃子，当即吃了一半，觉得好不过瘾，于是又多吃了一个
 *      第二天又吃了前天剩余桃子数量的一半，觉得好不过瘾，于是又多吃了一个
 *      以后每天都是吃前天剩余桃子数量的一半，觉得好不过瘾，又多吃了一个
 *      等到第10天的时候发现桃子只有1个了。
 *      请问:猴子第一天摘了多少个桃子？
 *
 * 分析：
 *      假设猴子第n天有的桃子数是f(n)
 * 推理：
 *     f(10)=1
 *     f(9) = (f(10)+1)*2
 *     f(8) = (f(9)+1)*2
 *     f(7) = (f(8)+1)*2
 *     ...
 *     f(n) = (f(n+1)+1)*2
 *
 * 总结规律：
 *     除了第10天f(10)=1
 *     其他的每一天 f(n)=(f(n+1)+1)*2
 */
public class Demo4 {
    public static void main(String[] args) {

        System.out.println(f(1));
    }

    /**
     * 求第n天桃子的数量
     * @param n  第n天
     * @return 第n天桃子的数量
     */
    public static int f(int n){
        if(n==10){
            return 1;
        }else {
            return (f(n+1)+1)*2;
        }
    }
}
