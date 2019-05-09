package com.leena.OCP.NIO9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExamples {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("fish.txt");
        Path path2 = Paths.get("birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));


        Path p1 = Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test1.txt");

        Path p2 = Paths.get ("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data/testChild.txt");

        System.out.println(p1.relativize(p2));

        System.out.println();

        System.out.println(p2.relativize(p1));


        Path pah1 = Paths.get("/primate/chimpanzee");
        Path pah2 = Paths.get("bananas.txt");
//        pah1.relativize(pah2); // THROWS EXCEPTION AT RUNTIME

        Path path3 = Paths.get("c:\\primate\\chimpanzee");
        Path path4 = Paths.get("d:\\storage\\bananas.txt");
        path3.relativize(path4); // THROWS EXCEPTION AT RUNTIME

       System.out.println(p2.toRealPath());

        System.out.println("\n" + Paths.get(".").toRealPath());

        System.out.println();

        System.out.println("Is Exist:  " + Files.exists(p2));


        System.out.println();

        System.out.println("Is Same FIle:  " + Files.isSameFile(p2,p2));


     //   Files.createDirectory(Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data/Test"));
      //  Files.createDirectories(Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data/Test1/Test2"));

        Files.copy(Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data"), Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data12"));

    }
}
