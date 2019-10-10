package com.leena.OCP.NIO9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveExample {

    public static void main(String[] args) {


        Path path3 = Paths.get("E:\\data");
        Path path4 = Paths.get("E:\\user\\home");
        Path relativePath = path3.relativize(path4);
        System.out.println(path3.resolve(relativePath));

        System.out.println(path3.resolve(relativePath).normalize());
    }
}
