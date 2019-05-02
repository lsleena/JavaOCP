package com.leena.OCP.ExceptionAndAssertion6;

public class AutoClosableException implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Close gate");
    }

    public static void main(String[] args) {
        try (AutoClosableException t = new AutoClosableException()) { // DOES NOT COMPILE
            System.out.println("Hello");
        }
    }

}