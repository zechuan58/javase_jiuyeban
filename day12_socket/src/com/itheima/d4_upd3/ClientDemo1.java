package com.itheima.d4_upd3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;


/**
   发送端：使用广播或者组播的方式发送消息
    广播地址：255.255.255.255
    组播地址：224.0.0.0 ~ 239.255.255.255
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("====客户端启动,准备发送消息====");
        //1、创建发送端对象：发送端自带默认的端口号（人）
        Socket socket=new Socket("127.0.0.1",9999);
        //2、创建一个数据包对象封装数据（韭菜盘子）
        OutputStream os=socket.getOutputStream();

        //练习1：发送广播消息（地址是255.255.255.255）

        //练习2：发送组播消息（地址是224.0.0.0 ~ 239.255.255.255），如：我们选择224.0.0.1

        //3、发送数据出去（甩数去）
        os.write("帅哥加个微信".getBytes());
        socket.shutdownOutput();
        //4、接收数据
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len;
        while ((len=is.read(bytes))!=-1){
            //把读取到的有效字节转换为字符串
            String str=new String(bytes,0,len);
            System.out.println(str);
        }

        //释放资源
        socket.close();
    }
}
