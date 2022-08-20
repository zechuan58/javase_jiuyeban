package com.itheima.d1_generic.demo2;

/*
需求:仿造ArrayList集合,自定义一个MyArrayList集合
    要求:元素类型由调用者指定
 */
public class Demo2 {
    public static void main(String[] args) {
        //创建MyArrayList集合,指定元素String类型
        MyArrayList<String> list= new MyArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        String s1=list.get(0);
        String s2=list.get(1);
        String s3=list.get(2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("===============");

        //创建MyArrayList集合,指定元素为Integer类型
        MyArrayList<Integer> list1=new MyArrayList<>();
        list1.add(200);
        list1.add(100);
        list1.add(300);

        Integer i1= list1.get(0);
        Integer i2= list1.get(1);
        Integer i3= list1.get(2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
