package com.leena.OCP.GenericsNCollections3.OCACollections;

import java.util.*;

public class OCACollectionDemo {

    public static void main(String[] args) {

        String[] array = {"Gerbil", "Mouse"};
        System.out.println("\nIn array:   " + array[0] + " : " + array[1]);
        List<String> list = Arrays.asList(array);
        System.out.println("\nIn List:   " + list.toString());

        list.set(1, "Monkey");
        System.out.println("\nIn List:   " + list.toString());

        array[0] = "Zebra";
        System.out.println("\nIn List:   " + list.toString());

        System.out.println("\nIn array:   " + array[0] + " : " + array[1]);

        String[] array2 = (String[]) list.toArray();
        //   list.remove(0);Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println("\nIn List:   " + list.toString());
        System.out.println("------*****************-----");

        int[] num = {3, 1, 7, 4};

        Arrays.sort(num);//sorting is important before using binary search method
        System.out.println(Arrays.binarySearch(num, 7));

        //num = {1,3,4,7}
        System.out.println(Arrays.binarySearch(num, 6)); // -4
        System.out.println(Arrays.binarySearch(num, 3)); // 1
        System.out.println(Arrays.binarySearch(num, 8)); // -5

        System.out.println("------*****************-----");

        List<Integer> listNum = Arrays.asList(3, 1, 7, 4);

        Collections.sort(listNum);
        System.out.println(listNum);   //        [1, 3, 4, 5, 56]
        System.out.println();

        System.out.println(
                Collections.binarySearch(listNum, 7)
        );

        System.out.println(
                Collections.binarySearch(listNum, 6)
        );
        System.out.println(
                Collections.binarySearch(listNum, 3)
        );
        System.out.println("------*****************-----");


        byte b = 3;

        Byte bwrapper = new Byte(b);
        System.out.println(bwrapper.getClass() + " " + b + " : " + bwrapper);

        Byte number = new Byte((byte) 9);
        System.out.println(number.getClass());

        System.out.println("------*****************-----");

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));

        System.out.println(numbers);
        numbers.remove(0);
//        Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
//        numbers.remove(3);
        System.out.println(numbers);

        numbers.remove(new Integer(3));
        System.out.println(numbers);

        numbers.add(6);

        System.out.println("------*****************-----");

        System.out.println("Unboxing");
        int unbox = numbers.get(1);
        System.out.println(unbox);

        HashMap<String, HashMap<String,String>> map = new HashMap<>();

    }
}
