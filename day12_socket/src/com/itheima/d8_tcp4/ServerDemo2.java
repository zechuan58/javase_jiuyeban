package com.itheima.d8_tcp4;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 目标：完成服务端代码的开发，实现多发，多收
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        //创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                10,//核心线程数
                20,//最大线程数
                3,//临时线程存活时间
                TimeUnit.SECONDS,//时间单位(秒)
                new ArrayBlockingQueue<>(10),//阻塞队列(任务在这里排队)
                Executors.defaultThreadFactory(),//线程工厂(用于创建线程)
                new ThreadPoolExecutor.AbortPolicy()
        );
        System.out.println("服务端启动。。。");
        // 1、注册端口
        ServerSocket server = new ServerSocket(6688);

        // 2、开始等待接收客户端的socket连接请求
        while (true) {
            Socket socket = server.accept();
            System.out.println(socket.getRemoteSocketAddress() + "上线了");
            // 创建一个线程任务
            MyRunnable mr = new MyRunnable(socket);
            //把线程任务交给线程池执行
            pool.submit(mr);
        }


        // 4、释放资源
        /*socket.close();
        server.close();*/

    }
}
