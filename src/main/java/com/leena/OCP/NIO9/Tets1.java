package com.leena.OCP.NIO9;

import java.util.stream.Stream;

public class Tets1 {


    public static void main(String[] args){

        Stream<String> stream = Stream.of("aaaab","aabc");
        System.out.println(stream.max((s1,s2) ->Integer.compare(s1.length(),s2.length())).get());
    }
}
