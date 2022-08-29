package com.itheima.d4_upd3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

/**
 * 接收端
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("====接收端端启动,准备接收消息====");
        //1、创建接收端对象：注册端口（人）
        ServerSocket server = new ServerSocket(10000);
        //2、创建一个数据包对象接收数据（韭菜盘子）
        Socket socket = server.accept();
        //3、等待接收数据（接菜）
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = in.read(bytes)) != -1) {
            String str = new String(bytes, 0, len);
            System.out.println("服务端返回数据:" + str);
        }
        //4、取出数据即可（有多少数据取多少数据）
        OutputStream os = socket.getOutputStream();

        String msg = "看你表现";
        os.write(msg.getBytes());
        //5、释放资源
        os.close();
    }
}
