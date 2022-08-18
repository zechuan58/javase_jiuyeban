package com.itheima.d3_static.demo4;

/*
产品经理
 */
public class ProductManager extends Employee {
    public ProductManager() {
    }

    public ProductManager(String name, int age, String division) {
        super(name, age, division);
    }

    @Override
    public void work() {
        System.out.println("我是" + Employee.companyName + "的员工");
        System.out.println("我的姓名是:" + getName());
        System.out.println("我的年龄是:" + getAge());
        System.out.println("我的部门是:" + getDivision());
        System.out.println("产品经理的工作职责是设计产品原型");
    }
}
