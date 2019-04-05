package com.leena.OCP.FunctionalProgramming;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class StreamTest {


    // Function convert a List into Stream
    private static <T> void getStream(List<T> list)
    {
        // Create stream object with the List
        Stream<T> stream = list.stream();

        // Iterate list first to last element
        Iterator<T> it = stream.iterator();

        // Iterate stream object
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
    // Function convert a List into Stream
    private static void getStream()
    {

        // Create a stream from specified values
        Stream<Integer> stream
                = Stream.of(1, 2,
                3, 4,
                5, 6,
                7, 8,
                9);
        System.out.println();

        // Displaying the sequential ordered stream
        stream.forEach(p -> System.out.print(p + " "));
    }


    public static void main(String[] args)
    {

        // Create ArrayList of String
        List<String> list = new ArrayList<>();

        // Add element in list
        list.add("Hello");
        list.add("Java");
        list.add("World");

        // Get the Stream from the List
        getStream(list);


        // Get the Stream from the values
        getStream();


        Stream<Integer> fromArray = Stream.of(1,2,3,4);

       List<Integer> list1 = fromArray.collect(Collectors.toList());
        System.out.println();
        System.out.println(list1);

        System.out.println();

        List<String> str = Arrays.asList("a","b","c");


        str.forEach(System.out::println);

        Stream<String> stringStream = str.stream();

        Stream<String> parallelStream = str.parallelStream();

        Stream<Double> randoms = Stream.generate(Math::random);


        //randoms.forEach(System.out::println);

        System.out.println("Terminal Operation Output: \n");
        System.out.println("Testing of : count():");

        Stream<String> countExample = Stream.of("Leena", "Jiya", "Navya");

        System.out.println(countExample.count());

        System.out.println("Testing of : min() and max():");

        /*
        min() an dmax() Methid signature as:
        Optional<T> min(<? super T> comparator)
        Optional<T> max(<? super T> comparator)
         */
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());

        min.ifPresent(System.out::println);


        System.out.println("Testing of : findAny() and findFirst() methods :");
        /*
        Optional<T> findAny()
        Optional<T> findFirst()
        */
        Stream<String> findString = Stream.of("Chimpazee","Gorilla","Baboon");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        findString.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        System.out.println("Testing of : allMatch() , anyMatch() and noneMatch()");

        /*
        boolean anyMatch(Predicate <? super T> predicate)
        boolean allMatch(Predicate <? super T> predicate)
        boolean noneMatch(Predicate <? super T> predicate)
         */

        List<String> list2 = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite1 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list2.stream().anyMatch(pred)); // true
        System.out.println(list2.stream().allMatch(pred)); // false
        System.out.println(list2.stream().noneMatch(pred)); // false
        System.out.println(infinite1.anyMatch(pred)); // true

        System.out.println("Testing of : foreach() ");

        /*
        void forEach(Consumer<? super T> action)
         */

        Stream<String> stringStream1 = Stream.of("MOnkeys","Zebra","Cow","BUffello");
        stringStream1.forEach(System.out::print);

        System.out.println("Testing of : reduce() ");

        String[] array = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String s1: array) result = result + s1;
        System.out.println(result);

        Stream<String> stream = Stream.of("w", "o", "r", "k");
        String word = stream.reduce("", (s1, c) -> s1 + c);
        System.out.println(word); // work

        Stream<Integer> stream1 = Stream.of(3, 5, 6);
        System.out.println(stream1.reduce(1, (a, b) -> a*b));

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        System.out.println();
        empty.reduce(op).ifPresent(System.out::print); // no output
        System.out.println();
        oneElement.reduce(op).ifPresent(System.out::print); // 3
        System.out.println();
        threeElements.reduce(op).ifPresent(System.out::print); // 90

        System.out.println("\nTesting of : collect()\n ");
        /*
        <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator,
        BiConsumer<R, R> combiner)
        <R,A> R collect(Collector<? super T, A,R> collector)
         */
        Stream<String> stream2 = Stream.of("g", "o", "l", "f");
        StringBuilder word1 = stream2.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(word1);


    }

}
