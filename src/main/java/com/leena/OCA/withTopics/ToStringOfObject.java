package com.leena.OCA.withTopics;

class Hippo{

    String name;
    int age;

    Hippo(){
        this.name = "Jamila";
        this.age = 10;
    }

    @Override
    public String toString(){   // this overrides Object's toString method

        return name + " age " + age;
    }

}
public class ToStringOfObject {

    public static void main(String[] args) {

        Hippo hippo = new Hippo();
        System.out.println(hippo);
    }
}
