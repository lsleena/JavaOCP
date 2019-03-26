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

    //JAVABEAN

    private boolean playing;
    private Boolean dancing;


    public boolean isPlaying() {
        return playing;
    }

    public Boolean getDancing() {
        return dancing;
    }

    // Not a valid JavaBean -- Boolean wrapper should start with get, since it is an object

    public Boolean isDancing() {
        return dancing;
    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.isDancing();
    }

}