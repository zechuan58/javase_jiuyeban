package com.itheima.d3_implements_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable类的对象
        MyCallable mc = new MyCallable();


        //创建FutureTack对象,把MyCallable对象封装起来
        //这里的FutureTack才是主线任务
        FutureTask<Integer> task = new FutureTask<>(mc);

        //第四步:创建Thread对象,将FutureTack对象作为参数封装起来
        Thread t = new Thread(task);

        //第五步:调用start方法,启动线程
        t.start();

        //第六步:等线程执行完之后,就可以通过FutureTack对象来获取线程的执行结果
        Integer result = task.get();
        System.out.println(result);

    }
}
