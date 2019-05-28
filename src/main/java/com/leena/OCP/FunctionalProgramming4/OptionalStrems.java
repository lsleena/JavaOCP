package com.leena.OCP.FunctionalProgramming4;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class OptionalStrems {
    public static void main(String[] args) {

         LongStream longs = LongStream.of(5, 10);
         long sum = longs.sum();
         System.out.println(sum); // 1
       //  DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
       //  OptionalDouble min = doubles.min(); // runs infinitely

        Stream<String> s = Stream.empty();
        Stream<String> s2 = Stream.empty();
        Stream<String> sream = Stream.of("Toby", "Anna", "Leroy", "Alex");

        Map<Boolean, List<String>> p = s.collect(
                Collectors.partitioningBy(b -> b.startsWith("A")));
       // Map<Boolean, List<String>> g = s2.collect(
         //       Collectors.groupingBy(b -> b.startsWith("c")));
        System.out.println(p + "********** " );


        Map<Boolean, List<String>> p1 = sream.collect(
                Collectors.partitioningBy(b -> b.startsWith("A")));
        System.out.println(p1 + "********** " );



    }
}
