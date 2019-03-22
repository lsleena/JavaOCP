package com.leena.OCP.designPatterns2.fuctionalInterface;

import com.leena.OCP.designPatterns2.interfaceDesign.Eagle;
import com.leena.OCP.designPatterns2.interfaceDesign.Lion;

@FunctionalInterface
public interface Sprint {

    public void sprint(Lion lion);

    //Functional interface contains only one interface
   // public void count();
}


class Tigress implements Sprint {

    @Override
    public void sprint(Lion lion) {
        System.out.println(lion.getMaxSpeed());

    }

    public static void main(String[] args) {

        new Tigress().sprint(new Lion());
    }
}

@FunctionalInterface
interface Run1 extends Sprint {}


@FunctionalInterface
interface SprintFaster extends Sprint {

    public void sprint(Lion lion);
}

@FunctionalInterface
interface Skip extends Sprint {

    //has added two methods one static and another default but it has only one abstact method inherited from Sprint thats why this is Functional Interface

    public default int getHopCount(Eagle eagle){

        return 19;
    }
    public static void skip(int speed){}
}