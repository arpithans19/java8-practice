package com.interview;


/* find the intersection
i/p=> int firstArray[]={1,2,2,1};
         int secondArray[]={2,2};
  o/p==> [2]
* int firstArray[]={1,9,2,4,1};
        int secondArray[]={2,9,8};
        o/p==> [2,9]       */


import java.util.Arrays;

public class TwoArraysIntersection {
    public static void main(String[] args) {


        int firstArray[] = {1, 2, 2,3,5,7 ,1};
        int secondArray[] = {2, 6,7,3,2};


        Arrays.stream(firstArray)
                .filter(x-> Arrays.stream(secondArray).anyMatch(y->y==x))
                .distinct()
                .forEach(System.out::println);
    }
}
