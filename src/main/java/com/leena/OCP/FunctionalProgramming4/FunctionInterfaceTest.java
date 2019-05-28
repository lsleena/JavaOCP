package com.leena.OCP.FunctionalProgramming4;

import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

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

        Stream<Integer> fromArray = Stream.of(1,  3); // count = 2
        System.out.println(fromArray.count());
        Stream<String> stream = Stream.of("w", "o", "l", "z");
        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]
    }
}

interface TriFunction<T,U,V,R> {
    R apply(T t, U u, V v);
}