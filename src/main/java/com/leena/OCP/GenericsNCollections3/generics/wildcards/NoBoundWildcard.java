package com.leena.OCP.GenericsNCollections3.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class NoBoundWildcard {


    public static void printElement(List<?> list) {

        for (Object element : list) {

            System.out.println(element + "  ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 34, 45);
        List<Double> listDouble = Arrays.asList(1.0, 2.8, 3.9, 3.4, 4.5);


        /*

        The method printElements(List<Object>) in the type WildCardDemo is not applicable for the arguments (List<Integer>)

         */

        printElement(list);

        printElement(listDouble);

    }
}