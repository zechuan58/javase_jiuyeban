package com.itheima.d3_api_object;

public class Demo9 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("张三", 23);

        //==比较地址值
        System.out.println(s1 == s2);//false
        //equals方法底层原本也是用==进行比较
        //但是equals重写后比较属性值
        System.out.println(s1.equals(s2));//true
    }
}
