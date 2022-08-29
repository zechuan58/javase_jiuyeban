package com.itheima.d1_inetaddress;
import java.net.InetAddress;
/**
    目标：InetAddress类概述（了解）
         一个该类的对象就代表一个IP地址对象。

    InetAddress类成员方法：
         static InetAddress getLocalHost()
            *
         static InetAddress getByName(String host)
            *
         String getHostName()
            *
         String getHostAddress()
            *
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        // 1.获取本地本机ip地址对象。
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        //获取主机名
        String hostName=address.getHostName();
        System.out.println("主机名:"+hostName);

        //获取主机地址
        String hostAddress = address.getHostAddress();
        System.out.println("主机地址:"+hostAddress);

        // 2.获取指定主机ip地址对象
        InetAddress byName= InetAddress.getByName("192.168.137.1");
        System.out.println(byName);


        // 3.获取公网IP对象。
        InetAddress ineraddr3 = InetAddress.getByName("182.61.200.7");
        System.out.println(ineraddr3);

        // 4.判断是否能通： ping  5s之前测试是否可通
        boolean b = ineraddr3.isReachable(5000);
        System.out.println(b);
    }
}