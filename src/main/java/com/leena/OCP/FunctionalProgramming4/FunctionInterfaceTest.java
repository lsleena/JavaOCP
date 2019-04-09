package com.leena.OCP.FunctionalProgramming4;

import java.util.function.BiFunction;
import java.util.function.Function;

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