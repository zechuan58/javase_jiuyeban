package com.practice.day11_demo;

/*
测试类
 */
public class MyRunnableTest1 {
    public static void main(String[] args) {
        //第二步： 创建MyRunnable类的对象
        MyRunnable mr = new MyRunnable();

        //第三步： 创建Thread对象，将MyRunnable对象作为参数传递进来
        //第二个参数：是给线程设置的名称(可以写，可以不写)
        Thread t1 = new Thread(mr);
        //t1.setName("第一个");
        //第四步： 调用start方法，启动线程。
        t1.start();

        //再创建一个线程，启动线程
        //Thread t2 = new Thread(mr);
        //t2.setName("第二个");
        //t2.start();
    }
}
