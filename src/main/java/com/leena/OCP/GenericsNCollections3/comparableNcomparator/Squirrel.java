package com.leena.OCP.GenericsNCollections3.comparableNcomparator;

import java.util.Comparator;

public class Squirrel {
    private int weight;
    private String species;

    public Squirrel(String theSpecies) {
        if (theSpecies == null) throw new IllegalArgumentException();
        species = theSpecies;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }
}

/*
class MultiFieldComparator implements Comparator<Squirrel> {

    public int compare(Squirrel s1, Squirrel s2) {

        int result = s1.getSpecies().compareTo(s2.getSpecies());
        if (result != 0) return result;
        return s1.getWeight() - s2.getWeight();
    }
}
*/

class ChainingComparator implements Comparator<Squirrel> {

    public int compare(Squirrel s1, Squirrel s2) {

        System.out.println(s1.getSpecies() + " " + s1.getWeight());

        Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
        c = c.thenComparingInt(s -> s.getWeight());
        System.out.println(c);
        return c.compare(s1, s2);
    }

    public static void main(String[] args) {

        Squirrel s1 = new Squirrel("A");
        s1.setWeight(30);
        Squirrel s2 = new Squirrel("A");
        s2.setWeight(20);

        ChainingComparator c = new ChainingComparator();
        System.out.println(c.compare(s1,s2));
    }
}