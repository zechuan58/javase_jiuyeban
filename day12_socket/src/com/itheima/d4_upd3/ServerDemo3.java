package com.itheima.d4_upd3;

import java.net.*;

/**
  接收端：实现组播接收
    ① 确认发送端的数据包的目的地是组播IP  (例如：224.0.1.1,  端口：9999)
    ② 需要使用DatagramSocket的子类MulticastSocket创建对象，表示组播的接收端，并绑定端口号（如：9999）。
    ③ 注册组播地址(如：224.0.1.1)，还要注册发送端的目的端口 9999

 */
public class ServerDemo3 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====服务端启动======");
        //1、创建接收端对象：注册端口（人）
        MulticastSocket socket = new MulticastSocket(9999);

        //注册组播地址（以后是可以接收这个组播消息，加群）
        socket.joinGroup(
                new InetSocketAddress("224.0.0.1",9999),
                NetworkInterface.getByInetAddress(InetAddress.getLocalHost()));

        //2、创建一个数据包对象接收数据（韭菜盘子）
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        //3、等待接收数据。
        socket.receive(packet);

        //4、取出数据即可（有多少数据取多少数据）
        byte[] data = packet.getData();
        int length = packet.getLength();
        InetAddress address = packet.getAddress();
        int port = packet.getPort();

        String str = new String(data,0,length);
        System.out.println("接收到来自IP"+address+"端口是"+port+"的数据："+str);

        //5、释放资源
        socket.close();
    }
}
