package com.leena.OCA;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Str1 {
    public static void main(String[] args) {
List<Integer> stream = Arrays.asList(1,2,3,4,4,6,6);

        System.out.println(stream.stream().filter(e -> e%2  == 0).mapToInt(i -> i).sum());


        Stream<String> str = Stream.of("abc","ab","asass");

        Optional<String> op =str.filter(s -> s.length()>5).findFirst().flatMap(s -> Optional.of("4"));
        System.out.println(op);

        Optional<Integer> op1 = Optional.of(8);

        //int i = op1.filter(p -> p > 8).ifPresent(System.out::print).orElse(0);
        System.out.println();
    }
    }
