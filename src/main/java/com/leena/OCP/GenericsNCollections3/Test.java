package com.leena.OCP.GenericsNCollections3;


import java.util.ArrayList;

/*
- ArrayList in Java is a Resizable-array implementation of the List interface.
- Internally ArrayList class uses an array of Object class to store its elements.
- When initializing an ArrayList you can provide initial capacity then the array would be of the size provided as initial capacity.
- If initial capacity is not specified then default capacity is used to create an array. Default capacity is 10.
- When an element is added to an ArrayList it first verifies whether it can accommodate the new element or it needs to grow,
 in case capacity has to be increased then the new capacity is calculated which is 50% more than the old capacity and the array
 is increased by that much capacity.
- When elements are removed from an ArrayList space created by the removal of an element has to be filled in the underlying array.
 That is done by Shifting any subsequent elements to the left.
*/


public class Test {

    public static void main(String args[]) {

        int a = 10;
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println(num.size());
        System.out.println(3003>>1);
        num.add(9);
        num.add(12);
        System.out.println(num.size());

        int oldCapacity = 10;

        System.out.println("oldCapacity: " + oldCapacity);

        int newCapacity = oldCapacity + (oldCapacity>>1);

        System.out.println("newCapacity: " + newCapacity);


    }
}