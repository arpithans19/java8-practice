package com.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Reverse a list */
public class RotationReversingList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);
        System.out.println(Arrays.toString(list.toArray()));

        // we are rotating only 4 elemets
        for (int i = 0; i < 4; i++) {
            int temp = list.get(5);
            for (int j = 5; j > 0; j--) {
                list.set(j, list.get(j - 1));

            }
          list.set(0,temp);

        }

        System.out.println("using for loop method=>"+list);


        Collections.rotate(list,-1);
        System.out.println("using Collections rotate method=>"+list);


        Collections.reverse(list);
        System.out.println("Collections.reverse=>"+list);
    }
}
