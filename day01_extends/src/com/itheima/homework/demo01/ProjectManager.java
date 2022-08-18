package com.itheima.homework.demo01;

/*
项目经理
 */
public class ProjectManager extends Employee {
    private double bonus;//奖金

    public ProjectManager() {
    }

    public ProjectManager(String name, String id, double wage, double bonus) {
        super(name, id, wage);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("项目经理的工作是设计产品原型");
    }

    public void show() {
        System.out.println("姓名:" + getName());
        System.out.println("工号:" + getId());
        System.out.println("工资:" + getWage());
        System.out.println("奖金:" + this.bonus);
    }
}
