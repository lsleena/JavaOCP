package com.leena.OCA;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        char[] ch = {'a', 'i', 'o', 'u', 'e'};
        for (char c : ch)
            System.out.println(c);


        String[] str = new String[]{"Navya", "Jiya"};
        System.out.println(str[0] + "   " + str[1] + "\n");

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);


        //searching

        System.out.println("---Binary Search---");

        int[] number = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(number, 2));
        System.out.println(Arrays.binarySearch(number, 4));
        System.out.println(Arrays.binarySearch(number, 1));
        System.out.println(Arrays.binarySearch(number, 3));
        System.out.println(Arrays.binarySearch(number, 9));

        //multi dimension

        System.out.println("---Multi-dimension---");

        int[][] metrix = new int[][] {{1,2,4,5,5},{9,9,9}};


        for (int i = 0; i < metrix.length; i++) {
            for (int j = 0; j < metrix[i].length; j++)
                System.out.print(metrix[i][j] + " ");
            System.out.println(); // time for a new row
        }
        System.out.println("---***************---");

        for (int[] inner: metrix){
            for (int num :inner){
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }
}
