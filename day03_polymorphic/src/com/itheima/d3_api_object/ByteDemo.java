package com.itheima.d3_api_object;

public class ByteDemo {
    public static void main(String[] args) {
        byte[] bytes ={65,66,67,68};
        //每一个字符都有一个整数与之对应ASCII编码
        String str=new String(bytes,0, bytes.length);
        System.out.println(str);//ABCD


        int a=str.compareTo("ABCD");
        System.out.println(a);

        System.out.println("---------------");

        StringBuilder sb = new StringBuilder("按时");
        System.out.println(sb);

        StringBuilder sb2=sb.insert(2,"下课");
        System.out.println(sb2);
    }
}
