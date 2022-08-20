package com.itheima.d2_list;
/*
演示LinkedList集合特有方法:
   底层:通过链表结构实现的。所以就可以针对头尾进行操作
        public void addFirst(E e)
            向头节点位置添加元素
        public void addLast (E e)
            向尾节点位置添加元素工
        public void removeFirst ()
            删除头结点位置的元素
        public void removeLast ()
            删除尾节点位置的元素
        public E getFirst()
            获取头节点位置的元素
        public E getLast ()
            获取尾节点位置的元素
 */

import java.util.LinkedList;

public class
Demo2 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

    }
}
