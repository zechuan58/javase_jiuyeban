package com.socketmodule.socketdemo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
接收端-广播
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);

        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

        ds.receive(dp);//接收包

        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data, 0, len));

        ds.close();//关闭资源
    }
}
