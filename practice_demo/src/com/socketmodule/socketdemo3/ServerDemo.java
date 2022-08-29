package com.socketmodule.socketdemo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/*
接收端-组播
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10000);

        DatagramPacket dp = new DatagramPacket(new byte[1024], 1024);

        ms.joinGroup(InetAddress.getByName("224.0.1.0"));

        ms.receive(dp);//接收包

        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data, 0, len));
        ms.close();
    }
}
