package com.itheima.d1_extends_thread;

/**
 * 目标：采用extends Thread方法实现线程
 * 步骤如下：
 *      第一步： 写一个MyThread类继承Thread类，复写run方法
 *      第二步： 创建MyThread类的对象
 *      第三步： 调用start方法，启动线程
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread t1 = new MyThread();
        //t1.setName("小明");
        //启动线程
        t1.start();

        //创建线程对象
        MyThread t2 = new MyThread();
        //t2.setName("小强");
        //启动线程
        t2.start();

        for (int i = 0; i < 100; i++) {
            //获取主线程的名字, 就是main
            String name = Thread.currentThread().getName();
            System.out.println(name+"继续执行"+i+"%");
        }
    }
}
