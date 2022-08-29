package com.itheima.d6_tcp2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
    目标：完成服务端代码的开发，实现多发，多收
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动。。。");
        // 1、注册端口
        ServerSocket server=new ServerSocket(10010);

        // 2、开始等待接收客户端的socket连接请求
        Socket socket= server.accept();

        // 3、从socket通信管道中得到一个字节输入流读取数据
        InputStream is=socket.getInputStream();

        //为了能够一次读取一行数据,可以把InputStream转换为Reader
        InputStreamReader isr=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);

        String line;//记录每次读取的一行
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        // 4、释放资源
        socket.close();
        server.close();

    }
}
