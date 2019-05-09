package com.leena.OCP.NIO9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectoryWalkExample {

    public static void main(String[] args) {

        Path path = Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data");
        try {

            Files.walk(path)
                    .filter(p -> p.toString().endsWith(".txt"))
                    .forEach(System.out::println);

            long dateFilter = 1420070400000l;

            System.out.println("\nThe" +
                    "Files.find(Path,int,BiPredicate) method behaves in a similar manner as the\n" +
                    "Files.walk() method\n");

            try {
                Stream<Path> stream = Files.find(path, 10,
                        (p,a) -> p.toString().endsWith(".java")
                                && a.lastModifiedTime().toMillis()>dateFilter);
                stream.forEach(System.out::println);
            } catch (Exception e) {
                // Handle file I/O exception...
            }
        } catch (IOException e) {

        }


        //serching directory using Files.find()
        /*
        Path path = Paths.get("/bigcats");
        long dateFilter = 1420070400000l;
        try {
        Stream<Path> stream = Files.find(path, 10,
        (p,a) -> p.toString().endsWith(".java")
        && a.lastModifiedTime().toMillis()>dateFilter);
        stream.forEach(System.out::println);
        } catch (Exception e) {
        // Handle file I/O exception...
        }
         */
    }

}
