package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsEx {
    public static void main(String[] args) {

List<Integer> list1=List.of(2,8,92,82);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(45);
        list.add(89);

        List l = list.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(l);

        Predicate<Integer> p=i->i>5;
        p.test(6);
        System.out.println(p.test(6));



    }

}
