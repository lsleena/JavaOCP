package com.leena.OCP.designPatterns2.polimorphismDemo;

class Rodent {
}


public class Capybara extends Rodent {

    public static void main(String[] args) {

        //throw aClassCastException at runtime since the object being referenced is not an instance of the
        //Capybara class.
        Rodent rodent = new Rodent();
      //  Capybara capybara = (Capybara) rodent;

        boolean ifInstance = rodent instanceof Capybara;

        System.out.println(ifInstance);

    }
}
