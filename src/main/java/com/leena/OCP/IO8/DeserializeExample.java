package com.leena.OCP.IO8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Animals implements Serializable {

    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age = 10;
    private static char type = 'C';

    {this.age = 14;}

    public Animals() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }

    public Animals(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getType() {
        return type;
    }

    public String toString() {
        return "Animals [name=" + name + ", age=" + age + ", type=" + type + "]";
    }

}


public class DeserializeExample {

    public static List<Animals> getAnimals(File dataFile) throws IOException, ClassNotFoundException {

        List<Animals> animals = new ArrayList<Animals>();

        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(dataFile)))) {

            while (true) {

                Object object = in.readObject();

                if (object instanceof Animals)
                    animals.add((Animals) object);
            }
        } catch (EOFException e) {

        }
        return animals;
    }

    public static void createAnimalsFile(List<Animals> animals, File dataFile) throws IOException {

        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Animals animal : animals)
                out.writeObject(animal);
        }
    }


    public static void main(String[] args) throws IOException,
            ClassNotFoundException {
        List<Animals> animals = new ArrayList<Animals>();
        animals.add(new Animals("Tommy Tiger", 5, 'T'));
        animals.add(new Animals("Peter Penguin", 8, 'P'));
        File dataFile = new File("animal.data");
        createAnimalsFile(animals, dataFile);
        System.out.println(getAnimals(dataFile));
    }

}

