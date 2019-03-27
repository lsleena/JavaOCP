package com.leena.OCP.designPatterns2.immutableObjects;

import java.util.*;
import java.util.List;

public class AnimalImmutable {

    /*
    2. Mark all of the instance variables private and final
     */
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    /*
    1. Use a constructor to set all properties of the object
     */
    public AnimalImmutable(String species, int age, List<String> favoriteFoods) {

        this.species = species;
        this.age = age;

        if (favoriteFoods == null){

            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    /*
    3. Don’t define any setter methods, only getter methods
     */
    public String getSpecies() {

        return species;
    }

    public int getAge() {

        return age;
    }

    public int getFavoriteFoodCount() {

        return favoriteFoods.size();
    }

    /*
    4. Don’t allow referenced mutable objects to be modified or accessed directly
    5. Prevent methods from being overridden because class itself mark as final class
     */
    public String getFavoriteFood(int index) {

        return favoriteFoods.get(index);
    }

    public static void main(String[] args) {

        List<String> arr = new ArrayList();
        arr.add("Grass");
        AnimalImmutable animal = new AnimalImmutable("Rabbit",5,arr);


        //mutable example by removeing,replacing or sorting lis

        System.out.println(animal.getFavoriteFood(0));

        // Create a new Animal instance
        AnimalImmutable lion = new AnimalImmutable("lion", 5, Arrays.asList("meat","more meat"));

        System.out.println(lion.getFavoriteFood(1));
        List<String> favoriteFoods = new ArrayList<String>();
        for(int i = 0; i < lion.getFavoriteFoodCount(); i++) {
            favoriteFoods.add(lion.getFavoriteFood(i));
        }

        AnimalImmutable updateLion = new AnimalImmutable(lion.getSpecies(), lion.getAge()+1,favoriteFoods);

        System.out.println(updateLion.getFavoriteFood(1));
        System.out.println(lion.getFavoriteFood(1));


    }
}
