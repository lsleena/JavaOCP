package com.leena.OCA;

public class StringDemo {

    public static void main(String[] args) {

        //method chaining

        String result = "AniMaL ".trim().toLowerCase().replace('a', 'A').concat(" Safety");
        System.out.println(result);

        // String literals
        String str1 = "abc";
        String str2 = "abc";
        if (str1 == str2) {
            System.out.println("str1 and str2 are same");
        } else {
            System.out.println("str1 and str2 are not same");
        }
        // Strings created using new operator
        String str3 = new String("abc");
        String str4 = new String("abc");
        if (str3 == str4) {
            System.out.println("str3 and str4 are same");
        } else {
            System.out.println("str3 and str4 are not same");
        }

        if (str1 == str4) {
            System.out.println("str1 and str4 are same");
        } else {
            System.out.println("str1 and str4 are not same");
        }

        str1 = "abc";
        str4 = new String("abc");
        // comparing content
        if (str1.equals(str4)) {
            System.out.println("str1 and str4 are same");
        } else {
            System.out.println("str1 and str4 are not same");
        }
        // comparing references
        if (str1 == str4) {
            System.out.println("str1 and str4 are same");
        } else {
            System.out.println("str1 and str4 are not same");
        }
    }
}
