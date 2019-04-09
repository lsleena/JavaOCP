package com.leena.OCP.FunctionalProgramming4;

import java.util.*;
import java.util.function.Consumer;

import java.util.function.BiConsumer;



/*
Table 4 .1 Common functional interfaces
FunctionalInterfaces #Parameters  ReturnType   SingleAbstractMethod
-------------------------------------------------------------------
Supplier<T>         |    0              T               get
Consumer<T>         |    1(T)          void             accept
BiConsumer<T, U>    |  2 (T, U)        void             accept
Predicate<T>        |    1 (T)          boolean         test
BiPredicate<T, U>   |   2 (T, U)        boolean         test
Function<T, R>      |   1 (T)            R              apply
BiFunction<T, U, R> |   2 (T, U)         R              apply
UnaryOperator<T>    |   1 (T)            T              apply
BinaryOperator<T>   |   2 (T, T)         T              apply
 */
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