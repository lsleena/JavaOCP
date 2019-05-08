package com.leena.OCP.NIO9;

import java.nio.file.*;


public class PathFilePathTest {

    public static void printPathInformation(Path path) {

        System.out.println("Filename is: "+path.getFileName());
        System.out.println("Root is: "+path.getRoot());
        Path currentParent = path;
        while((currentParent = currentParent.getParent()) != null) {
            System.out.println(" Current parent is: "+currentParent);
        }
    }

    public static void main(String[] args) {
        printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
        System.out.println();
        printPathInformation(Paths.get("armadillo/shells.txt"));

        Path path1 = Paths.get("/leenapatil/workspace/JavaOCP/src/main/resources/calendar.csv");
        System.out.println("Path1 is Absolute? "+path1.isAbsolute());
        System.out.println("Absolute Path1: "+path1.toAbsolutePath());
        Path path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? "+path2.isAbsolute());
        System.out.println("Absolute Path2 "+path2.toAbsolutePath());


        System.out.println("Printing path using subpath:\n");
        System.out.println(path1.subpath(0,1));
        System.out.println(path1.subpath(0,4));
        System.out.println(path1.subpath(5,7));


    }
}