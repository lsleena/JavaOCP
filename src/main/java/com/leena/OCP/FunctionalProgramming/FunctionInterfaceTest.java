package com.leena.OCP.FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceTest {

    public static void main(String args[]) {

        Function<String, Integer> f1 = String::length;

        Function<String, Integer> f2 = (x) -> x.length();

        System.out.println(f1.apply("Leena"));

        System.out.println(f2.apply("Computer"));

        BiFunction<String, String, String> b1 = String::concat;

        BiFunction<String, String, String> b2 = (x,y) -> x.concat(y);


        System.out.println(b1.apply("Java", "OCP"));
        System.out.println(b1.apply("Java", " Programming"));


        TriFunction<String, String,String,String > triConcat = (x,y,z) -> x.concat(y).concat(z);

        System.out.println(triConcat.apply("Hello", " Java ", "World"));
    }
}

interface TriFunction<T,U,V,R> {
    R apply(T t, U u, V v);
}