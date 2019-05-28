package com.leena;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        String s1 = new String("lion");
        String s2 = new String("lion");
        System.out.println(s1.equals(s2)); // true
        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");
        StringBuilder s4 = sb1;
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(s4));

        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
        for(Integer item: list) {
            System.out.print(item+" ");
            list.add(9);
        }
        System.out.println();
        System.out.println("Size of " + list+": "+list.size());

        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream().parallel();
      //  Stream<Integer> parallelStream = stream.parallel();

        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream()
                .reduce("",(c,s11) -> c + s11,
                        (s12,s3) -> s12 + s3));

    }
}
