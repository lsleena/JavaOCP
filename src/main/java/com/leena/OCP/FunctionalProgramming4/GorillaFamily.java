package com.leena.OCP.FunctionalProgramming4;

import java.util.function.Predicate;

interface Gorilla {

    String move();
}

public class GorillaFamily {

    String walk = "walk";

    void everyonePlay(boolean baby) {

        String approach = "amble";
      //  approach = "run";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
         play(() -> approach);// Error:(19, 20) java: local variables referenced from a lambda expression must be final or effectively final

    }

    private void play(Gorilla g) {

        System.out.println(g.move());
    }

    public static void main(String args[]) {

        GorillaFamily gf = new GorillaFamily();
        gf.everyonePlay(false);
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> brownEggs = egg.and(brown);

        Predicate<String> otherEggs = egg.and(brown.negate());
        System.out.println(brownEggs + " : Brown\n"+otherEggs) ;




    }
}

