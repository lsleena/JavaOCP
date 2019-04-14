package com.leena.OCP.concurrency7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class SynchronisedCollectionExample {

    public static void main(String[] args) {

        List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(3, 1, 4, 55)));


        synchronized (list) {

            for (int data : list) {

                System.out.println(data + "  ");
            }
        }


        Map<String, Object> foodData = new HashMap<String, Object>();

        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        Map<String,Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
        for(String key: synchronizedFoodData.keySet())
            synchronizedFoodData.remove(key); //Exception in thread "main" java.util.ConcurrentModificationException


    }
}
