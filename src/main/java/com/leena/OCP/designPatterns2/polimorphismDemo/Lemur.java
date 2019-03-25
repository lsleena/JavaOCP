package com.leena.OCP.designPatterns2.polimorphismDemo;

class Primate {

    public boolean hasHair() {

        return true;
    }
}

interface HasTail {

    public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {

    public int age  = 10;

    @Override
    public boolean isTailStriped() {
        return false;
    }


    public static void main(String[] args) {

        Lemur lemur = new Lemur();

        System.out.println(lemur.age);

        HasTail hasTail = lemur;

        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;

        System.out.println(primate.hasHair());
    }
}
