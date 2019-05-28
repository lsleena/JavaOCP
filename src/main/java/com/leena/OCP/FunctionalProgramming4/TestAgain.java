package com.leena.OCP.FunctionalProgramming4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestAgain {

    public static void main(String[] args) {

        System.out.println("**************");

        IntStream stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();

        optional.ifPresent(System.out::println);
        System.out.println(optional.getAsDouble());
        System.out.println(optional.orElseGet(() -> Double.NaN));

        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
       // list.stream().filter(n -> n.length() == 4).sorted()
         //       .limit(2).forEach(System.out::println);
        System.out.println("**************");

        IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
        count.forEach(System.out::println);

        System.out.println("**************");


        IntStream range = IntStream.range(11, 16);
        range.forEach(System.out::println);

        System.out.println("**************");


        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);

        System.out.println("**************");

        IntStream stram = IntStream.rangeClosed(1,10);
        OptionalDouble optinal = stram.average();

        optional.ifPresent(System.out::println);
        System.out.println(optional.getAsDouble());
        System.out.println(optional.orElseGet(() -> Double.NaN));


        Stream<String> sream = Stream.of("Toby", "Anna", "Leroy", "Alex");
        sream.filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("**************");

        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(3)
                .sorted()
                .forEach(System.out::println);


        Stream.generate(() -> "Olaf Lazisson")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);


    }
}
