package com.leena.OCA;



@FunctionalInterface
interface IMyInterface {
    int doCount(String str);
}


public class LambdaExpressionDemo1 {

    public static void main(String[] args) {

        // Lambda expression
        IMyInterface objRef = (str) -> {
            int c = 0;
            char ch[]= new char[str.length()];
            for(int i = 0; i < str.length(); i++){
                ch[i] = str.charAt(i);
                if(((i > 0) && (ch[i] != ' ') && (ch[i-1] == ' ')) ||
                        ((ch[0] != ' ') && (i == 0)))
                    c++;
            }
            return c;
        };

        System.out.println("Words in the string " + objRef.doCount("Lambda Expression in Java"));

    }
}