package com.leena.OCP.NIO9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveExample {

    public static void main(String[] args) throws IOException {


        Path path3 = Paths.get("E:\\data");
        Path path4 = Paths.get("E:\\user\\home");
        Path relativePath = path3.relativize(path4);
        System.out.println(path3.resolve(relativePath));

    //   Path path1 = Paths.get("/primate/chimpanzee");
     //   Path path2 = Paths.get("bananas.txt");
       // path1.relativize(path2); // THROWS EXCEPTION AT RUNTIME
        System.out.println(path3.resolve(relativePath).normalize());

        System.out.println(

        );
        System.out.println(path3.resolve(relativePath).normalize());

        try {
            System.out.println(Paths.get("/zebra/food.source").toRealPath());
            System.out.println(Paths.get(".././food.txt").toRealPath());
        } catch (IOException e) {
// Handle file I/O exception...
        }

        Path path1 = Paths.get("/lizard/./").resolve(Paths.get("walking.txt"));
        Path path2 = new File("/lizard/././actions/../walking.txt").toPath();
        System.out.print(Files.isSameFile(path1,path2));
        System.out.print(" "+path1.equals(path2));
        System.out.print(" "+path1.normalize().equals(path2.normalize()));
    }
}
