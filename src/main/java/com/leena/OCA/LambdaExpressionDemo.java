package com.leena.OCA;

interface IMInterface {
    int getValue();
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        IMInterface objRef;
        // Lambda expression
        objRef = () -> 7;
        System.out.println("Value is " + objRef.getValue());


        objRef = () -> 7 * 5;
        System.out.println("Value is " + objRef.getValue());
        // This line will give compiler error as target type

      //objRef = () -> "11";

        System.out.println("Lamba Expression with parameter");

    }
}