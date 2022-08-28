package com.itheima.d2_implements_runnable;

public class Demo1 {
    public static void main(String[] args) {

        //创建MyRunnable类的对象
        MyRunnable mr = new MyRunnable();

        //创建Thread对象,将Runnable对象作为参数传递进来
        Thread t1 = new Thread(mr,"小明");
        //调用start方法,启动线程
        t1.start();

        //创建Thread对象,将MyRunnable对象作为参数传递进来
        Thread t2=new Thread(mr,"小白");
        t2.start();
    }
}
