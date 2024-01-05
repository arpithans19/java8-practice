package com.strings;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StringImmutable {
    public static void main(String[] args) {
         String s="Ram";
         s="cam"+s;

        System.out.println(s);

        Predicate<Integer> p=i->i>8;
        System.out.println(p.test(9));

        Function<Integer,Integer> f=i->i*6;
        System.out.println(f.apply(8));

        Supplier<Date> ss=()->new Date();
        System.out.println(ss.get());

        Consumer<String> c=i-> System.out.println(i);
        c.accept("arpi");



    }
}
