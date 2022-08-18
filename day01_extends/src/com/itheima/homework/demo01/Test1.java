package com.itheima.homework.demo01;

/*
测试类
 */
public class Test1 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("张三", "heima001", 15999);
        programmer.show();
        programmer.work();
        System.out.println("-----------");

        ProjectManager projectManager = new ProjectManager("李四", "heima002", 19999, 10000);
        projectManager.show();
        projectManager.work();
    }
}
