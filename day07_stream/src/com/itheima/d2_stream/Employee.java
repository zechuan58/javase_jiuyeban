package com.itheima.d2_stream;

/*
员工类：封装员工的属性信息
    属性：姓名、性别、工资、奖金、处罚记录
 */
public class Employee {
    //属性：姓名、性别、工资、奖金、处罚记录
    private String name;
    private String sex;
    private double salary;
    private double bonus;
    private String punish;

    public Employee() {
    }

    public Employee(String name, String sex, double salary, double bonus, String punish) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
        this.bonus = bonus;
        this.punish = punish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPunish() {
        return punish;
    }

    public void setPunish(String punish) {
        this.punish = punish;
    }

    //获取实际收入
    public double getMoney(){
        return salary+bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                ", bonus='" + bonus + '\'' +
                ", punish='" + punish + '\'' +
                '}';
    }
}
