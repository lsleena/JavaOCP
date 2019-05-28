package com.leena.OCP.FunctionalProgramming4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        System.out.println();

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        System.out.println(map);

        map.merge(2, 3, (a,b) -> a + b);
        System.out.println(map);

        map.merge(3, 3, (a,b) -> a + b);
        System.out.println(map);

        System.out.println("**************");
        List<Integer> numbers = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        numbers.add(1);

        numbers.add(1);
        numbers.add(1);
        letters.add('y');
        letters.add('k');
        Stream<List<?>> steam = Stream.of(numbers, letters);
        //System.out.println(steam);
        steam.map(List::size).forEach(System.out::print); // 11

    }
}
