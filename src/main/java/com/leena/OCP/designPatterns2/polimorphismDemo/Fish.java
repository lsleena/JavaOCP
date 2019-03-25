package com.leena.OCP.designPatterns2.polimorphismDemo;


class Bird {

}

public class Fish {

    public static void main(String[] args) {

        Fish fish = new Fish();

        //can not compile
        Bird bird = (Fish) bird;

    }
}
