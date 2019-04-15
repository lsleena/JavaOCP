package com.leena.OCP.concurrency7;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingParallelReductionEx {

    public static void main(String[] args) {

        //findAny()  applied to a serial stream: This code consistently outputs the first value in the serial stream, 1.
        // System.out.println(Arrays.asList(1,2,3,4,5,6).stream().findAny().get());

        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().findAny().get());


        /*
            <U> U reduce(U identity,
                 BiFunction<U, ? super T, U> accumulator,
                 BinaryOperator<U> combiner);

         */

        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream().reduce("",
                        (c, s1) -> c + s1,
                        (s2, s3) -> s2 + s3));

        System.out.println(Arrays.asList('g', 'o', 'l', 'f', 'w', 'o', 'l', 'f')
                .parallelStream().reduce("", (c, s1) -> c + s1,
                        (s2, s3) -> s2 + s3));

        //Using without NOT AN ASSOCIATIVE ACCUMULATOR

        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> (a - b)));

        //Combining  result with collect

        System.out.println("\nCombining results with Collect()");
        Stream<String> streamStr = Stream.of("c", "o", "m", "p", "u", "t", "e", "r").parallel();

        SortedSet<String> sortedSet = streamStr.collect(ConcurrentSkipListSet::new, Set::add, Set::addAll);

        System.out.println(sortedSet);


        //Using one argument Collect() method

        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();

        Set<String> setStream = stream.collect(Collectors.toSet());
        System.out.println("\nSET: ");
        System.out.println(setStream); //with wood prints wod - set contains non duplicates item

        System.out.println("\nParallel Stream and parallel reduction::");

        Stream<String> ohMy = Stream.of("lion", "deer", "gorillas");

        ConcurrentMap<Integer, String> map = ohMy.collect(Collectors.toConcurrentMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2));
        System.out.println(map);

        System.out.println(map.getClass()); // class java.util.concurrent.ConcurrentHashMap


    }
}
