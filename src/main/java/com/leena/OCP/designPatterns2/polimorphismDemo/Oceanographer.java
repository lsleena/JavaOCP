package com.leena.OCP.designPatterns2.polimorphismDemo;


interface LivesInOcean {

    public void makeSound();
}


class  Dolphin implements LivesInOcean {


    @Override
    public void makeSound() {

        System.out.println("Whistle..");
    }
}

class Whale implements LivesInOcean {

    @Override
    public void makeSound() {

        System.out.println("Sing..");
    }
}


public class Oceanographer {

    public void checkSound(LivesInOcean animal) {

        animal.makeSound();
    }

    public static void main(String[] args) {


    }
}