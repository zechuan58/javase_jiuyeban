package com.itheima.d3_static.demo4;

/*
员工
 */
public class Employee {
    //员工的共有属性
    private String name;//姓名
    private int age;//年龄
    private String division;//部门
    public static final String companyName = "黑马头条科技有限公司";

    //空参构造
    public Employee() {
    }

    //有参构造


    public Employee(String name, int age, String division) {
        this.name = name;
        this.age = age;
        this.division = division;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    //工作
    public void work() {
    }
}
