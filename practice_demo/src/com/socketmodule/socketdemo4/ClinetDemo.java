package com.socketmodule.socketdemo4;

import java.io.IOException;
import java.net.*;

/*
发送端-广播
 */
public class ClinetDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();

        String s="广播";
        byte[] bytes=s.getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port=10000;
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length,address,port);

        ds.send(dp);//发送

        ds.close();//关闭资源
    }
}
