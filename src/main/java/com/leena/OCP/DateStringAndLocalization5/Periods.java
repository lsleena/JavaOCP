package com.leena.OCP.DateStringAndLocalization5;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Periods {

    public static void main(String[] arg) {

        Stream<String> stream1 = Stream.of("1.2","1.3","1.4");
        Optional<String> op = stream1.findAny();

        op.ofNullable(null).ifPresent(System.out::print);
        System.out.println(op);
         System.out.println(stream1.skip(2).limit(1).toArray()[1]);

        List<String> l11 = new ArrayList<String>();

        l11.add("A");
        l11.add("a");

        l11.add("Ba");

        l11.forEach(System.out::print);

       // System.out.println("Liust ste :: " + l11.set(0,"3"));

        System.out.println("************");
        LocalDateTime ldt = LocalDateTime.of(2015,11,28,9,21);

        ldt = ldt.truncatedTo(ChronoUnit.DAYS);
        System.out.println(ldt.toLocalDate());

        System.out.println(ldt.toLocalTime());
        System.out.println("Period of month normalised :: " + Period.ofMonths(13).normalized());


        Year y = Year.of(2014);

        LocalDate ym = y.atMonthDay(MonthDay.of(4,10));


        System.out.println(ym + "  :::  " + LocalDate.ofYearDay(2015,365));
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(20);
        dq.add(20);
        System.out.println(dq.element()+dq.poll());

        LocalDate date = LocalDate.of(2014,12,21);
        assert arg !=null :"NULL";
        System.out.println("OK");

        LocalDate l1 = LocalDate.of(2015,12,12);

        LocalDate l2 = LocalDate.of(2015,11,29);

        System.out.println("Zero period  :: " + Period.ZERO.getUnits() + l1.with(ChronoField.DAY_OF_YEAR,30));
        System.out.println("Chono unit :   " + l1.until(l2, ChronoUnit.HALF_DAYS));


        IntStream stream
                = IntStream.of(2,
                3, 4,
                5, 6,
                7, 8,
                9);


        OptionalInt firs = stream.peek(System.out::print).findAny(); //filter(x -> x<0).findFirst();
        System.out.println("**"+firs.getAsInt());
        System.out.println("FINDFIDFirst : "+firs);

        if (firs == null){
            System.out.println("NUll found");
        }
        else{
            System.out.println(firs.getAsInt());
        }

       // Stream<String> stream1 = Stream.of("F","LIO","BEA","GER");

        //stream1.forEach(s->s.toLowerCase()).forEach(System.out::print);
       /* Stream<String> stream1 = Stream.of("FOX","LIO","BEA","GER");
Stream<Integer> list = stream1.flatMap(s -> Stream.of(s.length()));
        System.out.println(list.collect(Collectors.toSet()));


        Stream<Double> stream1 = Stream.of(1.2,1.3,1.4);
        Stream<Integer> list = stream1.flatMap(s -> s.intValue());
        System.out.println(list.collect(Collectors.toSet()));*/
    }}
class Leena<Double>{

}