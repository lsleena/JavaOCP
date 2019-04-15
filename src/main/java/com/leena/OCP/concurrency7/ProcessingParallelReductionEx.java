package com.leena.OCP.concurrency7;

import java.util.Arrays;

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

        System.out.println(Arrays.asList(1,2,3,4,5,6)
        .parallelStream()
        .reduce(0,(a,b) -> (a - b)));

    }
}
