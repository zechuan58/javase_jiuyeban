package com.socketmodule.socketdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
发送端--组播
 */
public class ClinetDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String s = "hello 组播";//要发送的内容
        byte[] bytes = s.getBytes();//转字节类型
        InetAddress address = InetAddress.getByName("224.0.1.0");//组播地址
        int port = 10000;//端口号
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);


        //发送
        ds.send(dp);

        //关闭资源
        ds.close();
    }
}
