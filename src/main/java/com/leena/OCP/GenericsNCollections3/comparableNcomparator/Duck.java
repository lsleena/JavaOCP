package com.leena.OCP.GenericsNCollections3.comparableNcomparator;

import java.util.*;

public class Duck implements Comparable<Duck> {

    private String name;

    public Duck(String name) {

        this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }

    @Override
    public int compareTo(Duck o) {

        return name.compareTo(o.name);
    }

    public static void main(String args[]) {

    List<Duck> ducks = new ArrayList<>();

    ducks.add(new Duck("Quack"));
    ducks.add(new Duck("Puddles"));

    Collections.sort(ducks);
    System.out.println(ducks); // [Puddles, Quack]

    }
}
