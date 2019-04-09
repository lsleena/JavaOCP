package com.leena.OCP.FunctionalProgramming4;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

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

public class PredicateTest {

    public static void main(String[] args) {

        Predicate<String> p1 = String::isEmpty;

        Predicate<String> p2 = x -> x.isEmpty();


        System.out.println(p1.test(""));
        System.out.println(p2.test("Hello JAVA"));

        BiPredicate<String, String> b1 = String::startsWith;

        BiPredicate<String, String> b2 =  (string, prefix) -> string.startsWith(prefix);


        System.out.println("Is Leena starts with L: " + b1.test("Leena","L"));
        System.out.println("Is Leena starts with m: " + b2.test("Leena","m"));



    }
}
