package com.leena.OCP.GenericsNCollections3.OCACollections;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> cityList = new ArrayList<>(2);
        cityList.add("Jalgaon");
        cityList.add("Jalna");
        cityList.add("Jabalpur");
        cityList.add(null);
        cityList.add(null);

        cityList.add(3, "Chalisgaon");
        cityList.add("Jalgaon");
        cityList.add(null);


        for(String name : cityList)
        {
            System.out.println("City name: " + name);
        }
    }

}
