package com.leena.OCP.GenericsNCollections3.OCACollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OCACollectionDemo {

    public static void main(String[] args) {

        String[] array = {"Gerbil", "Mouse"};
        System.out.println("\nIn array:   " + array[0] + " : " + array[1]);

        List<String> list = Arrays.asList(array);
        System.out.println("\nIn List:   " + list.toString());



    }
}
