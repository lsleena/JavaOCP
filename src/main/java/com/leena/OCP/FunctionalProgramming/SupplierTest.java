package com.leena.OCP.FunctionalProgramming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String args[]) {


        Supplier<LocalDate> s1 = LocalDate::now;

        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(s1 + "     " + s2);
        System.out.println();
        System.out.println(d1);

        System.out.println(d2);

        Supplier<StringBuilder> str1 = StringBuilder::new;

        Supplier<StringBuilder> str2 = () -> new StringBuilder();


        System.out.println(str1.get());
        System.out.println(str2);


        Supplier<ArrayList<String>> supplier = ArrayList::new;

        ArrayList<String> a1 = supplier.get();
        System.out.println(supplier);


        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();

        // Print the random value using get()
        System.out.println(randomValue.get());

    }
}
