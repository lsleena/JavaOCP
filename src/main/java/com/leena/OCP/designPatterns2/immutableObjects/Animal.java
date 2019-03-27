package com.leena.OCP.designPatterns2.immutableObjects;

import java.util.*;
import java.util.function.UnaryOperator;

public final class Animal {

    private final List<String> favoriteFoods;

    public Animal(List<String> favoriteFoods) {

        if (favoriteFoods == null) {
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public List<String> getFavoriteFoods() { // MAKES CLASS MUTABLE!
        System.out.println(favoriteFoods.toArray().length);
        return favoriteFoods;
    }


    public static void main(String[] args) {

        List<String> arr = new ArrayList();
        arr.add("Grass");
        Animal animal = new Animal(arr);


        //mutable example by removeing,replacing or sorting lis

        animal.getFavoriteFoods().clear();


    }
}
