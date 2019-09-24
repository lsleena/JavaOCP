package com.leena.OCA.withTopics;

class Lion {

    private int idNumber;
    private int age;
    private String name;

    Lion(int idNumber, int age, String name) {

        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Lion)) return false;
        Lion otherLion = (Lion) obj;
        return this.idNumber == otherLion.idNumber;
    }
}
public class EqualsToOfObject {

    public static void main(String[] args) {

        Lion lino =  new Lion (231,4,"Kavang");

        System.out.println(lino.equals(new Lion(231,4,"eena")));

    }
}