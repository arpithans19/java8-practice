package com.lists;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
         int array[]={6,7,8};

        List<Integer> list=new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        //list.set(index,element) - replace element with specified index
        System.out.println(list.set(1,array[0]));

        list.remove(0);
        System.out.println(list);


    }
}
