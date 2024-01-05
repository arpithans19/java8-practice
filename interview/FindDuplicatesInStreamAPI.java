package com.interview;

import java.util.*;
import java.util.stream.Collectors;
/*Find duplicates in stream API job
 * i/p==>[2,3,4,5,3,5]
 * o/p==> [3,5]*/

public class FindDuplicatesInStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        Collections.addAll(list, 2, 3, 4, 5, 3, 5);
        System.out.println("List :" + list);
        //create set- (no duplicate in SET)

        Set<Integer> set = new HashSet<>();


        //filter(i -> !set.add(i))==> fetching each value from list and adding to set 
        List<Integer> duplicateValue = list.stream().filter(i -> !set.add(i))
                .collect(Collectors.toList());
        System.out.println("Duplicates: " + duplicateValue);


    }
}
