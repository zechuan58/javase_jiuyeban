package com.itheima.d2_implements_runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //先获取线程对象,再通过线程对象 获取线程的名称
//            Thread t = Thread.currentThread();
//            String name = t.getName();

            //把上面的两句代码合并为一句
            String name = Thread.currentThread().getName();
            System.out.println(name + "线程执行" + i + "%");
        }
    }
}
