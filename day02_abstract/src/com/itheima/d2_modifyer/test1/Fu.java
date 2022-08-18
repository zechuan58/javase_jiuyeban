package com.itheima.d2_modifyer.test1;

public class Fu {
    private void test1(){
        System.out.println("test1...private");
    }

    void test2(){
        System.out.println("test2...缺省");
    }

    protected void test3(){
        System.out.println("test3...protected");
    }

    public void test4(){
        System.out.println("test4...public");
    }

    public void method(){
        test1();
        test2();
        test3();
        test4();
    }
}
