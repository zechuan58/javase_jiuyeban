package com.itheima.d7_tcp3;

import java.net.ServerSocket;
import java.net.Socket;

/**
    目标：完成服务端代码的开发，实现多发，多收
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动。。。");
        // 1、注册端口
        ServerSocket server=new ServerSocket(6688);

        // 2、开始等待接收客户端的socket连接请求
        while (true) {
            Socket socket= server.accept();
            System.out.println(socket.getRemoteSocketAddress()+"上线了");
            // 创建一个线程任务
            MyRunnable mr=new MyRunnable(socket);
            new Thread(mr).start();
        }


        // 4、释放资源
        /*socket.close();
        server.close();*/

    }
}
