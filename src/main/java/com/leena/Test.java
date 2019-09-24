package com.leena;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

   /*     String s1 = new String("lion");
        String s2 = new String("lion");
        System.out.println(s1.equals(s2)); // true
        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");
        StringBuilder s4 = sb1;
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(s4));

        List<Integer> alist = new CopyOnWriteArrayList<>(Arrays.asList(4,3,52));
        for(Integer item: alist) {
            System.out.print(item+" ");
            alist.add(9);
        }
        System.out.println();
        System.out.println("Size of " + alist+": "+alist.size());

        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream().parallel();
      //  Stream<Integer> parallelStream = stream.parallel();

        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream()
                .reduce("",(c,s11) -> c + s11,
                        (s12,s3) -> s12 + s3));


        Locale uloc = new Locale.Builder().setLanguage("en").build();
        Locale loc = new Locale.Builder().setRegion("CA").build();

        System.out.println(loc.getDisplayLanguage(new Locale("En")));
        System.out.println(" "+loc.getDisplayCountry(new Locale("En")));


        LocalTime s = LocalTime.of(10,10);
        LocalTime t = LocalTime.of(20,1);
        System.out.println( "s"+s + "t" + t + " " +Duration.between(s,t).toHours());

        DateTimeFormatter format = DateTimeFormatter.ofPattern("y D");

        System.out.println(LocalDate.parse("2019 20",format));
*/
        List<Integer> list = new ArrayList<>();

list.add(1);
list.add(2);
        list.add(3);
       // list.replaceAll(i -> i/2);
Stream<String> str = Stream.of("123","234","345");
     //   Optional<String> out = str.anyMatch(s -> s.length()>3);
     //   System.out.println(out);
        System.out.println();
Stream<String> str1 = str.map((String s) -> s.substring(0,1));
        //System.out.println(str1);
        str1.forEach(System.out::print);
       // System.out.println(list.stream().distinct().count());
    }
}
