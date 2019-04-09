package com.leena.OCP.FunctionalProgramming4;

import java.util.function.*;
/*

@FunctionalInterface public class UnaryOperator<T>
        extends Function<T, T> { }
@FunctionalInterface public class BinaryOperator<T>
        extends BiFunction<T, T, T> { }
*/

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

public class UnaryOperatorTest {

    public static void main(String[] args) {

        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("leena"));

        System.out.println(u1.apply("computer"));


        BinaryOperator<String> b1 = (x, y) -> x.concat(y);

        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("Leena " , "Patil"));

        System.out.println(b1.apply("Java " , " Program"));

    }
}