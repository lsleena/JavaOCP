package com.leena.OCP.classDesign.fuctionalInterface.withLambdas;

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {

        species = speciesName;
        canHop = hopper;
        canHop = swimmer;
    }

    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }


}

