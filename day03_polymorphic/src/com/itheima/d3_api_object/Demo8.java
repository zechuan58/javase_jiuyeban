package com.itheima.d3_api_object;

import java.util.ArrayList;

//目标：使用Object的toString和equals方法
public class Demo8 {
    public static void main(String[] args) {
        Student s1=new Student("小明",20);
        String str1=s1.toString();
        System.out.println(str1);//Student{name='小明', age=20}
        System.out.println(s1.toString());//Student{name='小明', age=20}
        System.out.println(s1);//打印语句底层会自动调用toString

        System.out.println("--------------");

        Student s2=new Student("小波",25);
        String str2=s2.toString();
        System.out.println(str2);
        System.out.println(s2);//打印语句底层会自动调用toString

        System.out.println("---------------");
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("123");
        arrayList.add("456");
        arrayList.add("789");
        //ArrayList类中,重写了toString
        System.out.println(arrayList);
    }

}
