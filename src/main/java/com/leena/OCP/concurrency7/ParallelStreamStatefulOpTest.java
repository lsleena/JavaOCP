package com.leena.OCP.concurrency7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// why avoid stateful lambda expressions

public class ParallelStreamStatefulOpTest {

    public static void main(String[] args) {

        List<Integer> data = Collections.synchronizedList(new ArrayList<>()); //Used synchronizedList instead ArrayList otherwise it won't function according

        Arrays.asList(1,2,3,4,5,6).parallelStream()
                .map(i -> {data.add(i) ; return i;})                 // AVOID STATEFUL LAMBDA EXPRESSIONS!
                .forEachOrdered(i -> System.out.print(i + " "));

        System.out.println();
        for(Integer e: data) {
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println(Arrays.asList('w','o','l','f')
        .stream().reduce("",(c,s1) -> c + s1,
                        (s2,s3) -> s2 + s3));

    }
}