package com.leena.OCP.GenericsNCollections3.comparableNcomparator;

import java.util.*;
/*
  How to sort objects in different ways at different times
  or if object did not implement Comparable
 */


import java.util.Comparator;

public class Rhino implements Comparable<Rhino> {

    private String name;
    private int weight;

    public Rhino(String name, int weight) {

        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {

        return name;
    }

    @Override
    public int compareTo(Rhino r) {
        return name.compareTo(r.name);
    }

    public static void main(String[] args) {

        Comparator<Rhino> byWeight = new Comparator<Rhino>() {

            @Override
            public int compare(Rhino o1, Rhino o2) {

                return o1.getWeight() - o2.getWeight();
            }
        };

        Comparator<Rhino> byWeight1 = (o1, o2) -> o1.getWeight() - o2.getWeight();
        Comparator<Rhino> byWeight2 = (Rhino o1, Rhino o2) -> o1.getWeight() - o2.getWeight();
        Comparator<Rhino> byWeight3 = (o1, o2) -> {
            return o1.getWeight() - o2.getWeight();
        };
        Comparator<Rhino> byWeight4 = (Rhino o1, Rhino o2) -> {
            return o1.getWeight() -
                    o2.getWeight();
        };
        List<Rhino> rhinoList = new ArrayList<>();

        rhinoList.add(new Rhino("Quack", 7));
        rhinoList.add(new Rhino("Puddles", 10));

        System.out.println(rhinoList);
        Collections.sort(rhinoList);
        System.out.println(rhinoList);

        Collections.sort(rhinoList, byWeight);
        System.out.println(byWeight1);

        System.out.println(rhinoList);
        /*
        Comparator<Duck> byWeight = new Comparator<Duck>() { //DOES NOT COMPILE
            public int compareTo(Duck d1, Duck d2) {
                return d1.getWeight()—d2.getWeight();
            }
        };
        */

    }
}

