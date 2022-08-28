package com.practice.day11_demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
实现Runnable接口的线程类
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = sim.format(new Date());
            //String name = Thread.currentThread().getName();
            System.out.println(/*name+*/time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
