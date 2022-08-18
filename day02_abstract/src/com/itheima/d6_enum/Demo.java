package com.itheima.d6_enum;

public class Demo {
    public static void main(String[] args) {
        movie(Direction.UP);
    }

    public static void movie(Direction direction) {
        switch (direction) {
            case UP:
                System.out.println("玛丽向上跳了一下");
                break;
            case DOWN:
                System.out.println("玛丽向下蹲了一下");
                break;
            case LEFT:
                System.out.println("玛丽向左跑了一下");
                break;
            case RIGHT:
                System.out.println("玛丽向右跑了一下");
                break;
        }
    }
}
