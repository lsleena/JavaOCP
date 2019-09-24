package com.leena.OCA;

class HeavyAnimal{}
interface Mother{}
class Hippo extends  HeavyAnimal{}
class Elephant extends HeavyAnimal{}

public class TestInstanceOf {

    public static void main(String[] args){

        Hippo hippo = new Hippo();
        System.out.println(hippo instanceof Hippo);

      //  System.out.println(hippo instanceof Elephant); -- not possible since compilation check whether is related to Elephant since elephant
        //is not extended by Hippo it will give compiler error

        System.out.println(hippo instanceof Mother); //even Mother interface  is not implemented by Hippo there is possibility that it eill be implemented in future as
        // hippo can't extend 2 class but can implement multiple interface

    }
}
