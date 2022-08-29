package com.socketmodule.socketdemo1;

import java.io.IOException;
import java.net.InetAddress;

public class InetaddressDemo1 {
    public static void main(String[] args) throws IOException {
        //getByName(String host)  确定主机名称的IP地址,主机名称可以是机器名称,也可以是IP地址
        InetAddress address = InetAddress.getByName("泽川の坠机堡垒");

        //getHostName() 获取此IP地址的主机名
        String hostName = address.getHostName();
        System.out.println("主机名为:" + hostName);

        //getHostAddress() 返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();
        System.out.println("IP为" + ip);

    }
}
