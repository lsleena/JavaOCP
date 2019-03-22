package com.leena.OCP.designPatterns2.fuctionalInterface.usingPredicateInterface;

import com.leena.OCP.designPatterns2.fuctionalInterface.withLambdas.Animal;

public class FindMatchingAnimals {

    private static void print(Animal animal, Predicate<Animal> trait) {
        if(trait.test(animal))
            System.out.println(animal);

    }
    public static void main(String[] args) {

        print(new Animal("fish",false,true), a -> a.canSwim());

        print(new Animal("rabbit",true,false), a -> a.canHop());

    }
}
