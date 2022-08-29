package com.itheima.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
   服务端 接收端
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动~~~");
        // 1、创建接收端对象（人）: 注意：接收端必须注册端口，别人才能找到这儿
        DatagramSocket socket = new DatagramSocket(10000);
        // 2、创建数据包对象（接韭菜的盘子）
        // public DatagramPacket(byte buf[], int length)
        byte[] bytes=new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        // 3、接收数据包对象
        socket.receive(packet);

        //解析数据包
        byte[] data= packet.getData();
        //获取数据长度
        int length= packet.getLength();

        //获取发送端ip地址
        InetAddress ip=packet.getAddress();
        System.out.println("发送端ip:"+ip);

        //内容打印
        String str=new String(data,0,length);
        System.out.println(str);

        //关闭接收端
        socket.close();


    }
}
