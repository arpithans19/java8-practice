package com.lists;

import java.util.ArrayList;
import java.util.List;

public class ConvertCollectiontoArray {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(28);
        list.add(19);
        list.add(24);

        System.out.println("list="+list);

        /*Converting to array using toArray() */
        Object[] a =list.toArray();
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("using toARray()="+list.toArray().toString());
    }
}
