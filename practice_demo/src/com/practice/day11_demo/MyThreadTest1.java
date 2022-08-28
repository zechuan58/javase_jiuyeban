package com.practice.day11_demo;

public class MyThreadTest1 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.setName("线程1==");
        mt1.start();

        MyThread mt2 = new MyThread();
        mt2.setName("线程2==");
        mt2.start();
    }
}
