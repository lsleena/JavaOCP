package com.leena.OCP.designPatterns2.dataEncapsulation;

public class Animal {


    private String species;
    private int age;


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {

        if (species == null || species.trim().length() == 0){
            throw new IllegalArgumentException("Species is required");
        }
        this.species = species;
    }

    public int getAge() {

        if (age < 0) {
            throw new IllegalArgumentException("Age can not be negative");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}