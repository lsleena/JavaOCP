package com.leena.OCP.FunctionalProgramming;

import java.util.Optional;

public class OptionalTest {


    public static Optional<Double> average(int... scores) {

        if(scores.length == 0) return Optional.empty();

        int sum = 0;

        for (int score: scores) sum +=score;

        return Optional.of((double) sum /scores.length);
    }

    public static void main(String[] args) {

        System.out.println(average(12, 12, 12, 12, 12));
        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average()); // Optional.empty

        Optional<Double> opt = average(90,100);

        if(opt.isPresent()) {

            System.out.println(opt.get());
        }

        Optional<Double> opt1 = average();

        if(opt.isPresent()) {

          //  System.out.println(opt1.get()); //Exception in thread "main" java.util.NoSuchElementException: No value present

        }
        Optional o = (opt1 == null) ? Optional.empty(): Optional.of(opt1);
        Optional<Double> op = average();
         System.out.println(op.orElse(Double.NaN));
         System.out.println(op.orElseGet(() -> Math.random()));
         System.out.println(op.orElseThrow(() -> new IllegalStateException()));
    }
}