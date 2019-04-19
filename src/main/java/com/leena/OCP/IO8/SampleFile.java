package com.leena.OCP.IO8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SampleFile {

    public static void main(String[] args) {

        System.out.println(System.getProperty("File.separator"));

        System.out.println(File.separator);

        File file = new File("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test.txt");

        File parent = new File("/Users/leenapatil/workspace/JavaOCP/src/main/resources");

        File child = new File(parent, "data/testChild.txt");

        System.out.println(file.exists());

        System.out.println(child.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());

        System.out.println(file.length());

        System.out.println(file.getParent());

        System.out.println(child.getParent());

        if (file.exists()) {

            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());

            if (file.isFile()) {
                System.out.println("File size: " + file.length());
                System.out.println("File LastModified: " + file.lastModified());
            } else {
                for (File subfile : file.listFiles()) {
                    System.out.println("\t" + subfile.getName());
                }
            }
        }

        try {

            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test.txt"));
            System.out.println(bufferedReader.readLine());
        } catch (Exception e) {

        }
    }
}
