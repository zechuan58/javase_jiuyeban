package com.itheima.d4_interface.demo1;

/**
 * @author 11959
 * 目标：掌握接口的定义格式
 */
public class Demo1 {
    public static void main(String[] args) {
        int num = InterImpl.num;
        System.out.println(num);
        //创建接口对象
        InterImpl inter = new InterImpl();
        inter.show1();
        inter.show2();
    }
}
