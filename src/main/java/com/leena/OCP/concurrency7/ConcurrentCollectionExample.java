package com.leena.OCP.concurrency7;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentCollectionExample {

    private Map<String, Object> foodData = new HashMap<String, Object>();

    public synchronized void put(String key, Object value) {

        foodData.put(key, value);
    }

    public synchronized Object get(String key) {

        return foodData.get(key);
    }

    public static void main(String[] args) {

        ConcurrentCollectionExample example = new ConcurrentCollectionExample();

        example.put("name", 1);

        System.out.println(example.get("name"));
    }
}
