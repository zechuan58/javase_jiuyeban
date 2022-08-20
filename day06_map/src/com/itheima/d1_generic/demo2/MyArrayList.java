package com.itheima.d1_generic.demo2;

/*
MyArrayList类:用来表示一个集合,选择使用数组结构来存储元素
    在边写时,不确实元素的数据类型,这个数据类型需要调用者来指定
    达到这个目的,使用泛型

    规定<E>表示元素的数据类型
    class 类名<E>
 */
public class MyArrayList<E> {
    //当创建一个MyArrayList集合时,会自动创建一个长度为10的数组
    private Object[] array = new Object[10];
    private int index;//默认为0

    /**
     * 往集合中添加元素,实际上是往数组中添加元素
     * 参数E e:表示要添加的元素
     */
    public void add(E e) {
        array[index] = e;
        index++;
    }

    public E get(int index) {
        return (E)array[index];
    }

}
