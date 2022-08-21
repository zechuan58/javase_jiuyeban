package com.itheima.d5_map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
/*
需求:
    1.创建一个HashMap集合,键是学生对象(Student),值是籍贯(String)。
    2.存储三个键值对元素,并遍历
    3.如果有姓名、年龄相同的学生,认为是同一个学生
 */
public class Demo7 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();

        map.put(new Student("张三", 20), "湖北");
        map.put(new Student("李四", 25), "河南");
        map.put(new Student("王五", 28), "河北");
        map.put(new Student("王五", 28), "黑龙江");

        map.forEach((key, value) -> System.out.println(key + "..." + value));

        System.out.println("-------------------");

        LinkedHashMap<Student,String>map2=new LinkedHashMap<>();
        map2.put(new Student("张三", 20), "湖北");
        map2.put(new Student("李四", 25), "河南");
        map2.put(new Student("王五", 29), "河北");
        map2.put(new Student("王五", 28), "黑龙江");
        map2.forEach((key, value) -> System.out.println(key+"..."+value));


        System.out.println("------------------");

        TreeMap<Student,String>map1=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num= o2.getAge()-o1.getAge();
                if (num==0){
                    num=o2.getName().compareTo(o1.getName());
                }
                return num;
            }
        });
        map1.put(new Student("李四", 30), "河南");
        map1.put(new Student("王五", 25), "河北");
        map1.put(new Student("赵六", 27), "黑龙江");
        map1.forEach((key, value) -> System.out.println(key+"..."+value));
    }
}
