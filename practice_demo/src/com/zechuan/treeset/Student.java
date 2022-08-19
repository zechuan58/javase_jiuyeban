package com.zechuan.treeset;
/*
实现接口Comparable,重写当中的compareTo方法
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    重写接口compare中的compareTo方法
     */
    @Override
    public int compareTo(Student o) {
        //按照对象的年龄进行排序
        //age是主要判断条件
        int result = this.age - o.age;
        //如果年龄一样,就按照对象的姓名排序,调用String类中的compareTo方法比较年龄
        //name是次要比较条件
        result = result == 0 ? this.name.compareTo(o.name) : result;
        return result;
    }
}
