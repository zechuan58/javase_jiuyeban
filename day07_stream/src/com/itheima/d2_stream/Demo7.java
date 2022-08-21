package com.itheima.d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
/*
将流收集成指定的数组
 */
public class Demo7 {
    public static void main(String[] args) {
        ArrayList<Employee> list1 = new ArrayList<>();
        list1.add(new Employee("孙悟空", "男", 20000, 5000, "大闹天宫"));
        list1.add(new Employee("猪八戒", "男", 15000, 3000, "调戏嫦娥"));
        list1.add(new Employee("沙和尚", "男", 13000, 2000, "打碎琉璃盏"));
        list1.add(new Employee("白龙马", "男", 10000, 300, "毁了夜明珠"));

        //1.过滤集合中工资>=13000的员工,再把元素收集到一个List集合中去
        List<Employee> list = list1.stream().filter(employee -> employee.getSalary() >= 13000).collect(Collectors.toList());
        System.out.println(list);

        //2.过滤集合中工资>=13000的员工,再把元素收集到一个Set集合中去
        Set<Employee> set = list1.stream().filter(employee -> employee.getSalary() >= 13000).collect(Collectors.toSet());
        System.out.println(set);

        //3.过滤集合中工资>=13000的员工,再把元素收集到一个Map集合中去
        //注意:需要告诉收集方法,把什么当做键,把什么当做值
        Map<String, Double> map = list1.stream().filter(employee -> employee.getSalary() >= 13000).collect(Collectors.toMap(
                //把什么当做键(把姓名当做键)
                s -> s.getName(),
                //把什么当做值(把收入当做值)
                s -> s.getMoney()
        ));
        System.out.println(map);

        //4.过滤集合中工资>=13000的员工,再把流中的元素收集成数组  (不推荐)
        ////0bject[] array1 = list1.stream().filter(s -> s.getSalary() >= 13000). toArray();

        //收集成指定类型的数组,这里的value表示剩余元素的个数,创建一个Employee类型的数组,数组的长度为value
        Employee[] array2 = list1.stream().filter(s -> s.getSalary() >= 13000).toArray(value -> new Employee[value]);
        for (Employee employee : array2) {
            System.out.println(employee.getName() + "," + employee.getMoney());
        }
    }
}
