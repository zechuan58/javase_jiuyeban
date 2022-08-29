package com.itheima.d8_tcp4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyRunnable implements Runnable {
    private final Socket socket;
    public MyRunnable(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            InputStream is=socket.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader br=new BufferedReader(isr);

            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                if (line.equals("exit")){
                    System.out.println(socket.getRemoteSocketAddress()+"下线了");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
