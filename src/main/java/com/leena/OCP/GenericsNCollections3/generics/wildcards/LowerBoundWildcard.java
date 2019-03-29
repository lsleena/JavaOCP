package com.leena.OCP.GenericsNCollections3.generics.wildcards;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcard {

    public static void addElement(List<? super Integer> list,int num) {

        for (int i =0; i < num; i++) {

            list.add(i);
        }
    }

    public static void main(String[] args) {

        List<Object> list = new ArrayList<Object>();
        addElement(list,9);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<Integer>();
        addElement(list1,12);
        System.out.println(list1);

    }
}