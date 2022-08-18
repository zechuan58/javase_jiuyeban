package com.itheima.d3_static.demo4;

/*
程序员
 */
public class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(String name, int age, String division) {
        super(name, age, division);
    }

    @Override
    public void work() {
        System.out.println("我是" + Employee.companyName + "的员工");
        System.out.println("我的姓名是:" + getName());
        System.out.println("我的年龄是:" + getAge());
        System.out.println("我的部门是:" + getDivision());
        System.out.println("程序员的工作职责是使劲敲代码");
    }
}
