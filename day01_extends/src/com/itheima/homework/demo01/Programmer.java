package com.itheima.homework.demo01;

/*
程序员
 */
public class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(String name, String id, double wage) {
        super(name, id, wage);
    }

    @Override
    public void work() {
        System.out.println("程序员的工作职责是使劲敲代码");
    }

    public void show(){
        System.out.println("姓名:"+getName());
        System.out.println("工号:"+getId());
        System.out.println("工资:"+getWage());
    }
}
