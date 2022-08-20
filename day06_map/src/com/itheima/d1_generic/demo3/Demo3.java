package com.itheima.d1_generic.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo3 {
    public static void main(String[] args) {
        //往ArrayList集合中添加了个字符串
        Collection<String> coll1 = addElement(new ArrayList<String>(), "hello", "java", "world");
        System.out.println(coll1);

        //往HashSet集合中添加了3个整数
        Collection<Integer> coll2 = addElement(new HashSet<Integer>(), 20, 10, 30);
        System.out.println(coll2);
    }

    /**
     * 需求:往任意的Collection集合中添加任意类型的三个元素
     * <E>:表示方法上的泛型,用于表示集合中存储的元素类型
     */
    public static <E> Collection<E> addElement(Collection<E> coll, E e1, E e2, E e3) {
        coll.add(e1);
        coll.add(e2);
        coll.add(e3);
        return coll;
    }
}
