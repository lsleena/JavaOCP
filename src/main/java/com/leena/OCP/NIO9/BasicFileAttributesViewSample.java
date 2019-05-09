package com.leena.OCP.NIO9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesViewSample {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/leenapatil/workspace/JavaOCP/src/main/resources/data/testChild.txt");

        BasicFileAttributeView view = Files.getFileAttributeView(path,BasicFileAttributeView.class);

        BasicFileAttributes data = view.readAttributes();

        FileTime lastModifiedTime = FileTime.fromMillis(data.lastModifiedTime().toMillis()+10_000);

        view.setTimes(lastModifiedTime,null,null);


    }

}