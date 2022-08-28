package com.practice.day10_demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ChuShiBiao {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaDemo2\\javase_jiuyeban\\practice_demo\\src\\com\\practice\\day10_demo\\csb.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        List<String> orders = List.of("一", "二", "三", "四", "五", "陆", "柒", "八", "九", "十", "十一");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String fir1 = o1.split("\\.")[0];
                String fir2 = o2.split("\\.")[0];

                int index1 = orders.indexOf(fir1);
                int index2 = orders.indexOf(fir2);
                return index1 - index2;
            }
        });
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaDemo2\\javase_jiuyeban\\practice_demo\\src\\com\\practice\\day10_demo\\csb2.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}