package com.itheima.d1_generic.demo4;

/*
Dao接口定义一些对数据访问的方法,但是这些方法都是抽象方法
 */
public interface Dao<T> {
    public void add(T t);//把T类型的数据保存起来

    public void update(int id, T t);//更新指定编号的数据,T就表示新的数据

    public void remove(T t);//删除T类型的数据

    public T get(int id);//获取指定数据,数据类型为T类型
}
