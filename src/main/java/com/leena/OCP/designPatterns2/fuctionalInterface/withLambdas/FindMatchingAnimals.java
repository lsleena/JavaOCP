package com.leena.OCP.designPatterns2.fuctionalInterface.withLambdas;

public class FindMatchingAnimals {

    private static void print(Animal animal, CheckTrait trait) {

        if(trait.test(animal))
            System.out.println(animal);
    }

    public static void main(String[] args) {

        // Java treats CheckTarit as a functional interface and tries to m ap it as a abstarct method as
        // a -> a.canHop()  ==>     public boolean test(Animal a);
        print(new Animal("rabbit",false, true), a -> a.canHop());
        print(new Animal("kangaroo",true, false), a -> a.canHop());
        print(new Animal("fish",false, true), a -> a.canSwim());

    }
}
