package com.itheima.d4_interface.demo1;

/**
 * @author 11959
 * 接口的实现类
 */
public class InterImpl implements Inter1, Inter2 {

    @Override
    public void show1() {
        System.out.println("重写了Inter1接口中的show1方法");
    }

    @Override
    public void show2() {
        System.out.println("重写了Inter2接口中的show2方法");
    }
}
