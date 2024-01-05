package com.lists;

import java.util.Iterator;
import java.util.LinkedList;

public class GetElementsOfLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(20);
        linkedList.add(28);
        linkedList.add(19);
        linkedList.add(24);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(2));

        /*using For loop */
        System.out.println("using for loop - printig all elemnts in List");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }



        /*using Iterator */
        System.out.println("using Iterator - printig all elemnts in List");

        int i = 0;
        Iterator itr = linkedList.iterator();
        while (itr.hasNext()) {
            int j = (Integer) itr.next();
            System.out.println(j);
            ++j;


        }
    }
}
