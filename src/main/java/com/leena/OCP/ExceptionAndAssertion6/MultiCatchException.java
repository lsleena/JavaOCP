package com.leena.OCP.ExceptionAndAssertion6;


import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MultiCatchException {

   /* public static void main(String[] args) {

        try {

            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);

        } catch (DateTimeParseException e) {

            e.printStackTrace();
            throw new RuntimeException(e);

        } catch (IOException e) {

            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }*/

    public static void main(String[] args) {
        try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (Exception e) { // BAD approach
            e.printStackTrace();
            throw new RuntimeException(e);
        } }

}
