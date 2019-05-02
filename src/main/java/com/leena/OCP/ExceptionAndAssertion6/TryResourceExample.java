package com.leena.OCP.ExceptionAndAssertion6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryResourceExample {

    public void oldApproach(Path path1, Path path2) throws IOException {

        BufferedReader in = null;
        BufferedWriter out = null;

        try {

            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);

            out.write(in.readLine());

        } finally {

            if(in == null) in.close();
            if(out == null) out.close();
        }
    }


   public void newApproach(Path path1, Path path2) throws IOException {


      try (BufferedReader in = Files.newBufferedReader(path1);
      BufferedWriter out = Files.newBufferedWriter(path2)) {
             out.write(in.readLine());
           }
   }

    public static void main(String[] args) throws IOException {

        new TryResourceExample().
                oldApproach(Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test1.txt"), Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/test2.txt"));
    }
}