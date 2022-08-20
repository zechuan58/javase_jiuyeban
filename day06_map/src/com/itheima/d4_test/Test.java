package com.itheima.d4_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //创建一个集合,表示牌盒
        ArrayList<Poker> box = new ArrayList<>();

        //往box集合中添加54个扑克对象
        //一共有4个花色,每一张牌配4个花色
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //定义一个牌的序号
        int order = 0;

        //给每一行牌配四个花色
        for (String num : nums) {
            for (String color : colors) {
                Poker p = new Poker(color, num, order);
                order++;
                box.add(p);
            }
        }

        //单独添加大小王
        Poker p1 = new Poker();
        p1.setNum("小王");
        p1.setOrder(order++);
        box.add(p1);

        //单独添加大小王
        Poker p2 = new Poker();
        p2.setNum("大王");
        p2.setOrder(order);
        box.add(p2);

        //洗牌
        Collections.shuffle(box);

        //发牌:发给3个玩家,最后留三张
        ArrayList<Poker> player1 = new ArrayList<>();
        ArrayList<Poker> player2 = new ArrayList<>();
        ArrayList<Poker> player3 = new ArrayList<>();
        ArrayList<Poker> dipai = new ArrayList<>();

        //遍历box牌盒
        for (int i = 0; i < box.size(); i++) {
            //获取i索引位置的牌
            Poker p = box.get(i);
            if (i < box.size() - 3) {
                //根据i%3结果等于0或1,或者2发给不同的玩家
                if (i % 3 == 0) {
                    //发给玩家一
                    player1.add(p);
                } else if (i % 3 == 1) {
                    //发给玩家二
                    player2.add(p);
                } else {
                    //发给玩家三
                    player3.add(p);
                }
            } else {
                //否则留底牌
                dipai.add(p);
            }

        }
        //对每一个玩家手里的牌排序
        Comparator<Poker> comparator = new Comparator<Poker>() {
            @Override
            public int compare(Poker o1, Poker o2) {
                return o1.getOrder() - o2.getOrder();
            }
        };

        Collections.sort(player1, comparator);
        Collections.sort(player2, comparator);
        Collections.sort(player3, comparator);
        Collections.sort(dipai, comparator);

        //看牌
        System.out.println("玩家一的牌:" + player1);
        System.out.println("玩家二的牌:" + player2);
        System.out.println("玩家三的牌:" + player3);
        System.out.println("庄家留底牌:" + dipai);
    }
}
