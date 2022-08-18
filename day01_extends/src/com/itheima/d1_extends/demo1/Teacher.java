package com.itheima.d1_extends.demo1;

public class Teacher extends Person {
    //特有属性:部门名称dept
    private String dept;

    //空参构造方法
    public Teacher() {
    }

    //有三个参数的构造方法,用于给成员变量赋值
    public Teacher(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    //特有行为
    public void releaseFeedback() {
        System.out.println("老师正在讲课");
    }
}
