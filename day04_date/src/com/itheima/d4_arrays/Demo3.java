package com.itheima.d4_arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
数组排序练习：
    1.写一个Student类，有姓名和年龄两个属性
    2.创建一个Student类型的数组，添加5个学生对象
    3.对Student数组进行排序，按照年龄升序排列
 */
public class Demo3 {
    public static void main(String[] args) {
        //格式：数据类型[] 变量名 = new 数据类型[长度];
        //创建一个Student类型的数组，长度为5
        Student[] stus = new Student[5];

        //添加对象到数组中
        stus[0] = new Student("张三",18);
        stus[1] = new Student("李四",20);
        stus[2] = new Student("王五",19);
        stus[3] = new Student("赵六",22);
        stus[4] = new Student("田七",21);

        //对数组中的Student对象，按照年龄升序排列
        Arrays.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        //打印数组中的元素
        System.out.println(Arrays.toString(stus));
    }
}
