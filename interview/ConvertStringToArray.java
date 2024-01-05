package com.interview;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertStringToArray {
    public static void main(String[] args) {

        String s = "Arpitha";

        //array
        char[] ch = s.toCharArray();
//        for(char c:ch){
//            System.out.println(c);
//        }

        //list
        List<Character> charList = new ArrayList<>();
        for (char c : ch) {
            charList.add(c);
        }


        for (char c : charList) {
            System.out.println(c);
        }

        Set<Character> set=new HashSet<>();
        List<Character> list=charList.stream().filter(i->!set.add(i)).collect(Collectors.toList());
        System.out.println(list);

    }
}
