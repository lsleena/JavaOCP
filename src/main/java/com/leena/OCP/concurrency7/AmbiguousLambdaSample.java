package com.leena.OCP.concurrency7;

import java.io.IOException;
import java.util.function.Supplier;

public class AmbiguousLambdaSample {

    public static void useCallable(Callable<Integer> expression) { }


    public static void useSupplier(Supplier<Integer> expression) {}

    public static void use(Supplier<Integer> expression) {}

    public static void use(Callable<Integer> expression) {}


    public static void main(String[] args) {

        useCallable(() -> { throw new IOException();});

//        useSupplier( () -> {throw new IOException();});  // Does not compile

//        use(() -> { throw new IOException();}); // Does not compile - reference to use is ambiguous

    }
}