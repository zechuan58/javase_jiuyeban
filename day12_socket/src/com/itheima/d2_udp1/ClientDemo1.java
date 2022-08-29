package com.itheima.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
     目标：学会UDP通信 - 快速入门。  需求：1发 1收。
     客户端 发送端、
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个发送端对象（人）:注意：发送端不用注册端口，存在默认端口
        DatagramSocket socket = new DatagramSocket();

        // 2、创建一个数据包对象，封装数据（韭菜盘子）
        byte[] bytes="小黑子".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,InetAddress.getByName("192.168.137.1"),10000);

        // 3、发送数据包
        socket.send(packet);

        // 4、释放资源
        socket.close();
    }
}
