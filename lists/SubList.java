package com.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        try{
            List<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println(list);

            Iterator<Integer> itList=list.listIterator();
            System.out.println("Iterator");
            while (itList.hasNext()){
                Integer i=itList.next();
                System.out.println(itList);
            }

            System.out.println("for");
            for(Integer i:list){
                System.out.println(i);
            }

            System.out.print("Sublist=");
            List<Integer>list2=list.subList(1,5);
            System.out.println(list2);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");

        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException");

        }finally {
            System.out.println("Finally block printed");
        }
    }
}
