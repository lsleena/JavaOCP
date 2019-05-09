package com.leena.OCP.NIO9;


import java.nio.file.*;
import java.io.IOException;

public class FileAttributeTest {
    public static void main(String[] args) throws IOException {

        System.out.println(Files.isDirectory(Paths.get("/canine/coyote/fur.jpg")));
        System.out.println(Files.isRegularFile(Paths.get("/canine/types.txt")));
        System.out.println(Files.isSymbolicLink(Paths.get("/canine/coyote")));
    }
}
