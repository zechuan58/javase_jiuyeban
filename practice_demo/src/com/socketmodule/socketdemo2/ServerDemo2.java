package com.socketmodule.socketdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/*
接收端
 */
public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        //创建接收端对象   ------表示从10000端口接收数据
        DatagramSocket ds = new DatagramSocket(10000);

        //创建接收容器
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //接收
        ds.receive(dp);

        //拆包
        byte[] data = dp.getData();
        int length=dp.getLength();//调用getLength,获取数据的长度
        System.out.println(new String(data,0,length));

        //释放资源
        ds.close();

    }
}
