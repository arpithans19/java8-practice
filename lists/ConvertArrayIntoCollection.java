package com.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayIntoCollection {
    public static void main(String[] args) {

        String a[]={"a","b"};
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Input: "+Arrays.toString(a));
//

        /*Converting to list using asList() */
        System.out.println("Converting to list -asList()");

        List aslist=Arrays.asList(a);
        System.out.println("Converting to list -asList()"+aslist);

        /*Converting to list using Collection.addAll() */
//        Collections.addAll(list,a);
//        System.out.println("Converting to list using Collection.addAll()"+list);

        /*Converting to list using List.of() */
//        List listOf=new ArrayList<>(List.of(a));
//        System.out.println("Converting to list using List.of()"+listOf);

        /*Converting to list using Streams */
        List streamList=new ArrayList<>(Arrays.stream(a).collect(Collectors.toList()));
        System.out.println("Converting to list using Streams="+streamList);

    }
}
