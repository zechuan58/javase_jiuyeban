package com.itheima.d4_interface.demo2;

/**
 * @author 11959
 * 接口的实现类
 */
public class InterImpl extends Fu implements Inter3 {

    @Override
    public void show1() {
        System.out.println("重写了Inter1接口中的show1方法");
    }

    @Override
    public void show2() {
        System.out.println("重写了Inter2接口中的show2方法");
    }

    @Override
    public void show3() {
        System.out.println("重写了Inter3接口中的show3方法");
    }

    @Override
    public void show4() {
        System.out.println("重写了Fu类中的show4方法");
    }
}
