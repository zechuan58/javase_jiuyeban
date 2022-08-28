package com.itheima.d1_extends_thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String name=getName();
            System.out.println(name+"...线程开启..."+i+"%");
        }
    }
}
