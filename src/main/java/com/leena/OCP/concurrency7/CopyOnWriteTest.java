package com.leena.OCP.concurrency7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteTest {

    public static void main(String[] args) {

        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(8,69,38));

        for(Integer item: list) {
            System.out.println(item + "   ");
            list.add(9);
            System.out.println(item + "  *  ");

        }
        System.out.println(list);
        System.out.println(list.size());

    }
}