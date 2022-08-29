package com.itheima.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
   需求：接收端(接收端)，实现多次接收
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动~~~");
        // 1、创建接收端对象（人）: 注意：接收端必须注册端口，别人才能找到这儿
        DatagramSocket socket = new DatagramSocket(10086);

        // 2、创建数据包对象（接韭菜的盘子）
        // public DatagramPacket(byte buf[], int length)
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            // 3、接收数据包对象
            socket.receive(packet);
            // 得到读取的字节数量。
            int len = packet.getLength();

            // 4、把数据转换出来
            String rs = new String(buffer, 0, len);
            System.out.println(packet.getSocketAddress() + "说了" + rs);
        }

    }
}
