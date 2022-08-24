package com.itheima.d4_io_bytestream;

import java.io.Closeable;
import java.io.IOException;

public class MyInputStream implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("我被关闭了");
    }
}
