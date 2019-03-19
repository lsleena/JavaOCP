package com.leena.OCA;

public class CompileTimePolyDemo {

    // overloaded Method
    void overloadedMethod(int i) {

        System.out.println("\nIn overloadedMethod with int parameter- " + i);
    }

    // overloaded Method
    void overloadedMethod(int i, String s) {

        System.out.println("\nIn overloadedMethod with int and string parameters- " + i + " " + s);
    }


    public static void main(String args[]) {

        CompileTimePolyDemo obj = new CompileTimePolyDemo();
        obj.overloadedMethod(15);
        obj.overloadedMethod(15, "Test");
    }
}