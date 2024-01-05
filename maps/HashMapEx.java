package com.maps;

import java.util.HashMap;
import java.util.Set;

//public class HashMapEx {
//    public static void main(String[] args) {
//        HashMap<String,String> hmp= new HashMap<>(){
//
//            /*The first set of brace creates a new anonymous inner class
//            and the second set of brace creates an instance initializer like static block in class.*/
//
//            {
//                hmp.put("1", "One");
//            }
//            {
//                hmp.put("2", "Two");
//            }
//            {
//                hmp.put("3", "Three");
//            }
//        };
//        Set<String> set=hmp.keySet();
//        for(String s:set){
//            System.out.println(s);
//            System.out.println(hmp.get(s));
//        }
//    }
//
//}
/*--------------------------------------------------------------------------------------*/
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> hmp = new HashMap<>();

            /*The first set of brace creates a new anonymous inner class
            and the second set of brace creates an instance initializer like static block in class.*/


        hmp.put("1", "One");


        hmp.put("2", "Two");


        hmp.put("3", "Three");


        Set<String> key = hmp.keySet();
        for (String s : key) {
            System.out.println(key);
            System.out.println("value: "+hmp.get(s));
        }
    }

}