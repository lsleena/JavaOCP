package com.leena.OCP.GenericsNCollections3.Collections.methodExamples;

import java.util.ArrayList;
import java.util.*;

public class App {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println(list.add("Hello"));

        System.out.println(list.add("Hello"));

        Set<String> set = new HashSet<>();

        System.out.println();

        System.out.println(set.add("Hello"));

        System.out.println(set.add("Hello"));

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println("\nIs empty: " + birds.isEmpty());

        System.out.println(birds.remove("Cardinal"));
        System.out.println(birds.remove("hawk"));

        birds.clear();
        System.out.println("\nIs empty: " + birds.isEmpty());


    }

}
