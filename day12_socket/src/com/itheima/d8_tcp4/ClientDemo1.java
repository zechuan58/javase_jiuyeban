package com.itheima.d8_tcp4;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
    目标：完成TCP通信客户端开发：实现多发，多收
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个Socket对象，请求与服务器的连接（TCP通信）
        Socket socket=new Socket("192.168.87.47",6688);

        // 2、从socket通信管道中得到一个字节输出流，负责写数据出去
        OutputStream os=socket.getOutputStream();

        //为了让客户端能够往服务端直接发送字符串数据,可以OutputStream转换格式
        OutputStreamWriter osw=new OutputStreamWriter(os);

        //为了能够一行一行发送消息,把OutStreamWriter再封装成BufferedWriter
        BufferedWriter bw=new BufferedWriter(osw);


        //准备发送的数据
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("发送的消息:");
            String msg=sc.next();
            bw.write(msg);
            bw.newLine();//换行
            bw.flush();//刷新
            if (msg.equals("exit")){
                System.out.println("客户端已退出");
                break;
            }
        }

        // 4、释放资源
        socket.close();
    }
}
