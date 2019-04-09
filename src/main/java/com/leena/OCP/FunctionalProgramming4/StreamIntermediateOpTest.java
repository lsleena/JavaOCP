package com.leena.OCP.FunctionalProgramming4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOpTest {

    public static void main(String[] args) {

        /*
        Stream<T> filter(Predicate<? super T> predicate)
         */

        System.out.println("Filter() Example:");

        Stream<String> stream = Stream.of("FOX","LION","BEAR","TIGER");

        List<String> list = stream.filter(x->x.startsWith("B")).collect(Collectors.toList());

        System.out.println(list);
        Stream<String> stream1 = Stream.of("FOX","LION","BEAR","TIGER");

        stream1.filter(x -> x.startsWith("T")).forEach(System.out::print);

        System.out.println("\n Distinct() Example:");

        Stream<String> stream2 = Stream.of("FOX","FOX","BEAR","TIGER");

        stream2.distinct().forEach(System.out::print);

    }
}
