package com.leena.OCA;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Leena");
        StringBuilder str1 = new StringBuilder(5);

        System.out.println(str1.append("Los Angles"));

        //charAt(), indexOf(), length(), and substring()
        StringBuilder sb = new StringBuilder("animals");
        String subStr = sb.substring(sb.indexOf("a"),sb.indexOf("m"));

        System.out.println(sb.toString() + "   " + subStr);

        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(subStr + "  " + len + " " + ch);

        //append
        StringBuilder sb1 = new StringBuilder().append(1).append('c');
        sb1.append("-").append(true);
        System.out.println(sb1);

        //insert
        System.out.println(sb1.insert(5,"  False   "));

        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        System.out.println(sb);

    }
}
