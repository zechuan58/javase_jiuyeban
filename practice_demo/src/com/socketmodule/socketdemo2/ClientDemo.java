package com.socketmodule.socketdemo2;

import java.io.IOException;
import java.net.*;
import java.util.Date;

/*
发送端
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {

        //创建发送端对象
        DatagramSocket ds = new DatagramSocket();

        //打包数据
        String s="这是UDP发送的消息";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port=10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        //发送数据
        ds.send(dp);

        //关闭资源
        ds.close();


    }

}

