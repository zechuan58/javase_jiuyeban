package com.itheima.exception;

public class Demo7 {
    public static void main(String[] args) throws NumberTooBigExcetpion {
        print(100);
    }

    public static void print(int n) throws NumberTooBigExcetpion {
        if (n < 0 || n > 100) {
            throw new NumberTooBigExcetpion("数据过大");
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
