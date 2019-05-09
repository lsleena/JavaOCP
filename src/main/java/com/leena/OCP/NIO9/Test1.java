package com.leena.OCP.NIO9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test1 {

    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test1.txt");
             OutputStream out = new FileOutputStream("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test2.txt")) {
// Copy stream data to file
       //     Files.copy(is, Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test2.txt"));
// Copy file data to stream
            Files.move(Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data/Test/testMove.txt"), Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data/Test1"));
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
