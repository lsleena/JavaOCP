package com.leena.OCP.FunctionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

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
