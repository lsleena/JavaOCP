package com.leena.OCP.GenericsNCollections3.generics;

class GenType<T> {

    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }



}

public class GenericDemo {

    public static void main(String[] args) {

        // With Integer type
        GenType<Integer> genInt = new GenType<Integer>();
        genInt.setObj(21);
        int value = genInt.getObj();
        System.out.println("integer value " + value);

        // With String type
        GenType<String> genStr = new GenType<String>();
        genStr.setObj("Generic class test");
        String str = genStr.getObj();
        System.out.println("String value " + str);

        // With Double type
        GenType<Double> genDouble = new GenType<Double>();
        genDouble.setObj(34.56);
        double dblValue = genDouble.getObj();
        System.out.println("Double value " + dblValue);

    }
}