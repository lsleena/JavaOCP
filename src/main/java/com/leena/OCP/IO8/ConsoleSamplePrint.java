package com.leena.OCP.IO8;

import java.io.*;
import java.util.Locale;


public class ConsoleSamplePrint {

    public static void main(String[] args) throws NumberFormatException, IOException {

        Console console = System.console();
     //   console.writer().format(new Locale("fr", "CA"),"Hello World");

        if(console == null) {

            throw new RuntimeException("Console not available");

        } else {

            console.writer().println("Welcome to Our Zoo!");
            console.format("Our zoo has 391 animals and employs 25 people.");
            console.writer().println();
            console.printf("The zoo spans 128.91 acres.");
        }
    }
}