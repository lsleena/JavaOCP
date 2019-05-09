package com.leena.OCP.NIO9;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public static void main(String[] args) throws URISyntaxException {

        Path pat   = Paths.get("/window/file");

        Path path1 = Paths.get("C:","First","Dir" +
                "ik");

        Path path2 = Paths.get("c:","zooinfo","November","employees.txt");
        Path path3 = Paths.get("/","home","zoodirector");
        Path pat3 = Paths.get(new URI("file:///home/zoodirectory"));
//        Path path4 = Paths.get(new URI("http://www.wiley.com"));
  //      URI uri4 = path4.toUri();

        Path pathFilesystem = FileSystems.getDefault().getPath("c:","zooinfo","November",
                "employees.txt");

        File file = new File("pandas/cuddly.png");
        Path pathFile = file.toPath();

        File file1 = pathFile.toFile();

        Path path = Paths.get("/mammal/carnivore/raccoon.image");
        System.out.println("Path is: "+path);
        System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,3));
        System.out.println("Subpath from 1 to 3 is: "+path.subpath(1,3));
        System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2));

    }
}