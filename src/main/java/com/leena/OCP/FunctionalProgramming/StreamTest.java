package com.leena.OCP.FunctionalProgramming;

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
        System.out.println("count():");

        Stream<String> countExample = Stream.of("Leena", "Jiya", "Navya");

        System.out.println(countExample.count());

        System.out.println("min() and max():");

        /*
        min() an dmax() Methid signature as:
        Optional<T> min(<? super T> comparator)
        Optional<T> max(<? super T> comparator)
         */
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());

        min.ifPresent(System.out::println);



    }

}
