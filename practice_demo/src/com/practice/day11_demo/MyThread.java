package com.practice.day11_demo;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            String name=getName();
            System.out.println(name+"开始执行"+i);
        }
    }
}
