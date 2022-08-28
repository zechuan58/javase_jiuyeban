package com.practice.day11_demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/*
Callable测试类
 */
public class MyCallableTest1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft1 = new FutureTask<>(mc);
        Thread t1 = new Thread(ft1);
        t1.setName("一");
        t1.start();
        Integer sum1 = ft1.get();
        System.out.println(t1.getName() + "线程计算1--100的累加和，结果:" + sum1);


        FutureTask<Integer> ft2 = new FutureTask<>(mc);
        Thread t2 = new Thread(ft2);
        t2.setName("二");
        t2.start();
        Integer sum2 = ft2.get();
        System.out.println(t2.getName() + "线程计算1--100的累加和，结果:" + sum2);
    }
}
