package com.itheima.d9_thread_pool;

import java.util.concurrent.*;

public class Demo1 {
    public static void main(String[] args) {
        //使用ThreadPoolExecutor的构造方法,创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,  //核心线程数3个
                5,  //最大线程数5个
                2,  //临时线程存活时间2秒
                TimeUnit.SECONDS,   //单位:秒
                new ArrayBlockingQueue<>(10),   //任务队列的长度为10(可以有10个任务排队)
                Executors.defaultThreadFactory(),   //获取线程工厂
                new ThreadPoolExecutor.AbortPolicy()    //拒绝策略
        );

        //注意:以上的线程池中,最大任务量=最大线程数+任务队列的长度=5+10=15
        //第16个任务就会拒绝,这里的拒绝方式是抛出一个异常 RejectedExecutionException

        //往线程池中提交16个任务
        for (int i = 1; i <= 16; i++) {
            final int j = i;
            //提交线程任务
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    //如果内部类中访问外部类的局部变量时,这个变量会默认加上final关键字
                    //不能对这个变量进行修改
                    System.out.println(Thread.currentThread().getName() + "线程执行了" + j);
                }
            });
        }
    }
}
