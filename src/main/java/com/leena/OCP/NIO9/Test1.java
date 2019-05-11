package com.leena.OCP.NIO9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test1 {

    public static void main(String[] args) {

      /*  try (InputStream is = new FileInputStream("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test1.txt");
             OutputStream out = new FileOutputStream("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test2.txt")) {
// Copy stream data to file
       //     Files.copy(is, Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test2.txt"));
// Copy file data to stream
            Files.move(Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data/Test/testMove.txt"), Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data/Test1"));
        } catch (IOException e) {
// Handle file I/O exception...
        }*/

        String s1 = new String("lion");
        String s2 = new String("lion");
        String s3 = s1;
        System.out.println(s1.equals(s2)); // true
        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb3 = sb1;
        StringBuilder sb2 = new StringBuilder("lion");
        System.out.println(sb1.equals(sb2)); // false

        System.out.println(s1==s2);
        System.out.println(sb1==sb2);
        System.out.println();
        System.out.println(sb1==sb3);
        System.out.println(s1==s2);
        System.out.println(s1==s3);



    }
}
