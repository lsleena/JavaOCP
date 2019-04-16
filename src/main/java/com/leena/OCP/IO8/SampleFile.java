package com.leena.OCP.IO8;

import java.io.File;

public class SampleFile {

    public static void main(String[] args) {

        System.out.println(System.getProperty("File.separator"));

        System.out.println(File.separator);

        File file = new File("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test.txt");

        File parent = new File("/Users/leenapatil/workspace/JavaOCP/src/main/resources");

        File child = new File(parent,"data/testChild.txt");

        System.out.println(file.exists());

        System.out.println(child.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println("Is Directory: "+ file.isDirectory());
        System.out.println("Is File: "+ file.isFile());

        System.out.println(file.length());

    }
}
