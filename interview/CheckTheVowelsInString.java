package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Check whether String contains vowels or not*/
public class CheckTheVowelsInString {
    public static void main(String[] args) {


        String s = "Arpitha";
        String i = "i";

        String lowercase = s.toLowerCase();
        System.out.println(lowercase);
//        if (lowercase.contains(i)) {
//            System.out.println(i);
//
//
//        } else {
//            System.out.println("not vowles");
//
//        }

        List<Character> characterList = Arrays.asList('a', 'e', 'i', 'o', 'u');
        Long l = lowercase.chars()
                .mapToObj(c -> c)
                .filter(characterList::contains)
                .count();

        System.out.println(l);
    }
}

