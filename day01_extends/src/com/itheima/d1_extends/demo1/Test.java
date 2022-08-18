package com.itheima.d1_extends.demo1;

public class Test {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student("张三",18,"Java152期");
        System.out.println("学生姓名:" + s.getName());
        System.out.println("学生年龄:" + s.getAge());
        System.out.println("学生班级:" + s.getClassName());
        //调用学生的特有方法
        s.writeFeedback();

        System.out.println("-----------------------");

        //创建老师对象
        Teacher t = new Teacher("老王",35,"教研部");
        System.out.println("老师姓名:" + t.getName());
        System.out.println("老师年龄:" + t.getAge());
        System.out.println("老师部门:" + t.getDept());
        //调用老师的特有方法
        t.releaseFeedback();
    }
}
