package com.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashTableKeySet {
    public static void main(String[] args) {


        HashMap<Integer,String> hs=new HashMap<>();
        hs.put(1,"a");
        hs.put(2,"am");

        System.out.println(hs);
        System.out.println("clone="+hs.clone());
//        System.out.println("="+hs.computeIfPresent(1,null));
        System.out.println(hs.containsKey(1));

        Set h=hs.keySet();
        System.out.println(h);

        Iterator itr= h.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        /*check key is odd or even*/

        for(int k:hs.keySet()){
            if(k%2==0){
                System.out.println(k);
            }
        }

    }
}
