package com.leena.OCP.OCP2.Lambdas;

class Dog {

    private String name;
    private int weight;
    private int age;

    public Dog(String name, int weight, int age){

     this.name = name;
     this.weight  = weight;
     this.age = age;
    }

    public String getName() {
        return this.name;

    }

    public int getWeight() {
        return this.weight;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name;
    }

}

interface DogQuerier {
    public boolean test(Dog d);
}

public class TestDogs {
    public static void main(String[] args) {

        Dog boi = new Dog("boi",30,6);
        Dog clover = new Dog("clover",35,12);
        DogQuerier dq = d -> d.getAge() > 9 ;


        //Accessing Variables from Lambda Expressions
        int numCats = 3;
        int numBalls =9;
        DogQuerier dqWithCats = d  -> {

            //variables must be final or effectively final.
            //  numBalls = 9;

            System.out.println("Number of balls : " + numBalls);
            System.out.println("Number of cats : " + numCats);
            return d.getAge() > 10 ;
        };



        System.out.println("Is boi older than 9 " + dq.test(boi));
        System.out.println("Is clover older than 9 " + dq.test(clover));

        DogPlay dogPlay = new DogPlay(dq);

        DogPlay dogPlay1 = new DogPlay(d -> d.getAge() >9);
        System.out.println();
        System.out.println("Is Dog older than 9: " + dogPlay.doQuery(boi));

        System.out.println("Use dogplay :");
        DogPlay dp = new DogPlay(dqWithCats);

        System.out.println("Is clover older than 10 ?  " + dp.doQuery(clover));

    }

}

//Passing Lambda Expressions to Methods

class DogPlay{

    DogQuerier dogQuerier;

    public DogPlay(DogQuerier dogQuerier){
        this.dogQuerier = dogQuerier;
    }

    public boolean doQuery(Dog d) {

        return dogQuerier.test(d);
    }
}
