package com.leena.OCP.FunctionalProgramming;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.function.Consumer;

import java.util.function.BiConsumer;




public class ConsumerTest {

    public static void main(String args[]) {


        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");

        Map<String, Integer> map = new HashMap<>();

        BiConsumer<String, Integer> b1 = map::put;

        System.out.println(map); // empty before calling BiConsumer


        BiConsumer<String,Integer> b2 = (k, v) -> map.put(k,v);

        b1.accept("First",1);
        b2.accept("Second",2);

        System.out.println(map); //After getting called by BiConsumer

        Map<String, String> map1 = new HashMap<>();

        BiConsumer<String, String> b11 = map1::put;
        BiConsumer<String, String> b21 = (k, v) -> map1.put(k, v);

        System.out.println(map1);

        b11.accept("chicken", "Cluck");
        b21.accept("chick", "Tweep");
        System.out.println(map1);
    }
}