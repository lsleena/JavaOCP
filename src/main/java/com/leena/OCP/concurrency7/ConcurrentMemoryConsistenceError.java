package com.leena.OCP.concurrency7;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMemoryConsistenceError {

    public static void main(String[] args) {

        Map<String, Object> foodData = new ConcurrentHashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet()) ///Got Exception in thread "main" java.util.ConcurrentModificationException due to using HashMap
        {
            System.out.println(key);

            foodData.remove(key);
        }
    }
}
