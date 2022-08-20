package com.practice.day6_demo;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 测试类,TreeSet集合
 *
 *      创建一个员工类Employee，有姓名name、年龄age、工资salary属性
 *      创建3个员工对象，添加到TreeSet集合中
 *      要求按照员工的工资排序；如果工资相同，按照年龄排序；如果年龄也相同，再按照姓名的字典顺序排序;
 */
public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int result = o1.getSalary() - o2.getSalary();
                if (result == 0) {
                    result = o1.getAge() - o2.getAge();
                    if (result == 0) {
                        result = o1.getName().compareTo(o2.getName());
                    }
                }
                return result;
            }
        });
        set.add(new Employee("b张三", 23, 29999));
        set.add(new Employee("c李四", 22, 19999));
        set.add(new Employee("a王五", 25, 17999));

        for (Employee employee : set) {
            System.out.println(employee);
        }
    }
}
