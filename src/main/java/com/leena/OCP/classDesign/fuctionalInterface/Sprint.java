package com.leena.OCP.classDesign.fuctionalInterface;

import com.leena.OCP.designPatterns.interfaceDesign.Lion;

@FunctionalInterface
public interface Sprint {
    public void sprint(Lion lion);
}


class Tigress implements Sprint {

    @Override
    public void sprint(Lion lion) {
        System.out.println(lion.getMaxSpeed());

    }

    public static void main(String[] args) {

        new Tigress().sprint(new Lion());
    }
}