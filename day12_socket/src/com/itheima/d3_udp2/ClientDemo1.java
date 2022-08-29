package com.itheima.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 目标：客户端（发送端） 多次发送
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个发送端对象（人）:注意：发送端不用注册端口，存在默认端口
        DatagramSocket socket = new DatagramSocket();

        // 2、创建一个数据包对象，封装数据（韭菜盘子）
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("发送消息:");
            String msg = sc.next();
            if (msg.equals("exit")) {
                break;
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.87.176"), 10086);
            //3.发送数据
            socket.send(packet);
            // 4、释放资源
            //socket.close();
        }
    }
}
