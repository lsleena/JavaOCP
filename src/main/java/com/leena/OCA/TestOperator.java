package com.leena.OCA;

public class TestOperator {

    public static void main(String[] args) {

     //If two values have different data types, Java will automatically promote one of the valuesto the larger of the two data types.
        short x = 14;
        float y = 13;
        double z = 30;

        System.out.println(x*y/z);

     //Logical Complement and Negation Operators

        boolean x1 = false;
        System.out.println(x1);
        x1 = !x1;
        System.out.println(x1);

        double x2 = 1.21;
        System.out.println(x2); // 1.21
        x2 = -x2;
        System.out.println(x2); // -1.21
        x2 = -x2;
        System.out.println(x2); // 1.21
    }
}
