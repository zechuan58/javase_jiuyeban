package com.itheima.d9_thread_pool;

import java.util.concurrent.*;

public class Demo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //使用ThreadPoolExecutor的构造方法,创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,  //核心线程数3个
                5,  //最大线程数5个
                2,  //临时线程存活时间2秒
                TimeUnit.SECONDS,   //单位:秒
                new ArrayBlockingQueue<>(10),   //任务队列的长度为10(可以有10个任务排队)
                Executors.defaultThreadFactory(),   //获取线程工厂
                new ThreadPoolExecutor.AbortPolicy()    //拒绝策略
        );

        //注意:以上的线程池中,最大任务量=最大线程数+任务队列的长度=5+10=15
        //第16个任务就会拒绝,这里的拒绝方式是抛出一个异常 RejectedExecutionException

        //调用submit方法,如果需要返回值,它会把返回值封装到Future对象里面
        Future<Integer> f = pool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //求1-100的和
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                return sum;
            }
        });
        Integer result = f.get();
        System.out.println(result);
    }
}
