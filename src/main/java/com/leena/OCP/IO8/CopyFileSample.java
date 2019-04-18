package com.leena.OCP.IO8;

import java.io.*;

public class CopyFileSample {

    public static void copy(File source, File destination) throws IOException {

        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
    public static void main(String[] args) throws IOException {

        File source = new File("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test.txt");
        File destination = new File("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test1.txt");
        copy(source,destination);
    }
}