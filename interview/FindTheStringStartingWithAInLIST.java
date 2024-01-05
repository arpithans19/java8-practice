package com.interview;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheStringStartingWithAInLIST {
    public static void main(String[] args) {


        List<String> list = List.of("Arpitha", "Amriutha", "Ravi", "Rakesh");
//        Iterator iterator=list.listIterator();
        for(String s:list){
//            System.out.println(s);
//            System.out.println( s.charAt(0));

            if(s.charAt(0)=='A'){
                System.out.println(s);
            }


        }
        System.out.println(list);

        List l= list.stream().filter(s1->s1.startsWith("A")).collect(Collectors.toList());

        System.out.println(l);
//        while (iterator.hasNext()){
//            iterator.next();
//            System.out.println(iterator);
//        }


    }
}
