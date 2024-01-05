package com.lists;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class FindMaxNumberInVector {
    public static void main(String[] args) {

        /* */

        Vector<Integer> v = new Vector<>();
        v.add(20);
        v.add(28);
        v.add(19);
        v.add(24);

        /*using Collection max */
        System.out.println(Collections.max(v));

        /*using iterator*/

        int maxValue = Integer.MIN_VALUE;
//        System.out.println(maxValue);

        // Creating an iterator to traverse through vector
        // in the beginning itr will point to index just
        // before first element
        Iterator itr = v.iterator();


        // See if there is any next element
        while (itr.hasNext()) {

            // Moving iterator to next element
            int nextElement = (Integer) itr.next();

            // Comparing if element is larger than maxValue
            if (nextElement > maxValue) {
                maxValue = nextElement;
            }

        }
        System.out.println(maxValue);
    }
}
