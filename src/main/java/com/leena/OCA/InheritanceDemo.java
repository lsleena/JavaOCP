package com.leena.OCA;


class A {

    public int a = 10;
    private int b = 15;

    public void displayFromA() {

        System.out.println("Value of a " + a);
    }
}


class B extends A {

    int c = 20;

    public void displayFromB() {

        System.out.println("Value of field a " + a);

        displayFromA();

        System.out.println("Value of field c " + c);
    }
}

class Animal {

    private int age;

    public Animal(int age) {

        super();
        this.age = age;
        System.out.println(age);

    }
}

class Zebra extends Animal {

    public Zebra(int age) {

        super(age);
        System.out.println(age);
    }

    public Zebra() {

        super(4);
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        B b = new B();
        // calling the method of class B using class B object
        b.displayFromB();
        // calling the method of class A using class B object
        b.displayFromA();

        Zebra animal = new Zebra(14);


    }
}