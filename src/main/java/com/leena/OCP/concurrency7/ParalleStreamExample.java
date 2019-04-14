package com.leena.OCP.concurrency7;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParalleStreamExample {

    public static void main(String[] args) {

        Stream<Integer> stream = Arrays.asList(3,2,4,56).stream();

        Stream<Integer> parallelStream = stream.parallel();

        parallelStream.forEach(s -> System.out.print(s + "   "));
    }
}
