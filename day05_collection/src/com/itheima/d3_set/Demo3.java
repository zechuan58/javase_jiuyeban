package com.itheima.d3_set;

import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合对元素进行排序：
    排序方式：
        1.自然排序： 元素实现Comparable接口
        2.比较器排序：在集合创建时传递Comparator比较器对象
 */
public class Demo3 {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("bbb");
        set1.add("ccc");
        set1.add("aaa");
        set1.add("ddd");
        System.out.println(set1);
        System.out.println("--------------");


        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(5);
        set2.add(1);
        set2.add(4);
        set2.add(2);
        set2.add(3);
        System.out.println(set2);

        //添加自定义元素
        System.out.println("--------------");
        /*TreeSet<Student> set3 = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });*/

        //改写为lambda表达式
        TreeSet<Student> set3 = new TreeSet<>((o1, o2) -> {
            int result = o1.getAge() - o2.getAge();
            result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
            return result;
        });
        set3.add(new Student("张三", 20));
        set3.add(new Student("小李四", 21));
        set3.add(new Student("小李四", 22));
        set3.add(new Student("小李四", 21));
        set3.add(new Student("王五", 22));
        for (Student student : set3) {
            System.out.println(student);
        }
    }
}
