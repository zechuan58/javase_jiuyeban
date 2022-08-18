package com.itheima.d3_api_object;

public class Demo2 {
    public static void main(String[] args) {
        String str = "20 90 80 78 66 50";
        //对字符串按照" "进行切割,得到一个字符串的数组
        String[] arr = str.split(" ");

        //定义求和变量
        int sum = 0;

        //遍历
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            int num=Integer.parseInt(s);
            sum+=num;
        }
        System.out.println("平均值:"+(sum/ arr.length));
    }
}
