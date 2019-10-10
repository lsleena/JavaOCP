package com.leena.OCPByKathy.Thread1030.ExersizesynchronizingBlockOfCode;

public class PrintLetter extends Thread {

    StringBuffer str;

    public PrintLetter(StringBuffer stringBuffer) {

        this.str = stringBuffer;

    }

    @Override
    public void run() {
        synchronized (PrintLetter.class) {


            for (int x = 0; x < 100; x++) {
                System.out.print(str);
            }
            char c = str.charAt(0);
            c++;
            str = new StringBuffer(Character.toString(c));
            System.out.println();
        }
    }


    public static void main(String[] args) {


        StringBuffer s = new StringBuffer("A");
        PrintLetter printLetter = new PrintLetter(s);

        Thread one = new Thread(printLetter);
        one.start();
        Thread two = new Thread(printLetter);
      //  two.start();
        Thread three = new Thread(printLetter);
        three.start();


    }
}
