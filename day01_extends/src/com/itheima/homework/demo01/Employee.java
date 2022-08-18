package com.itheima.homework.demo01;

/*
员工类
 */
public class Employee {
    //共有属性
    private String name;//姓名
    private String id;//工号
    private double wage;//工资

    public Employee() {
    }

    public Employee(String name, String id, double wage) {
        this.name = name;
        this.id = id;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    //行为
    public void work(){
    }
}
