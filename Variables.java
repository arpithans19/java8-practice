package com;

public class Variables {

    private static int $;

    public static void main(String[] args) {
        String a_b = "";

        System.out.println($);
        System.out.println(a_b); // get error --> bcs not intialized

        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

        long longWithL = 1000 * 60 * 60 * 24 * 365L;

       /* the second statement does not have L at last,
        so it gives a different value as a result.
        Because it treated as integer and evaluates result in integer.
         But the result goes beyond the boundary of the integer range.
         Hence, it starts truncating the value i.e. 1471228928.
         Therefore, the purpose of L is that it explicitly denotes the long value.
        */
        long longWithoutL = 1000 * 60 * 60 * 24 * 365;

        System.out.println(longWithL);
        System.out.println(longWithoutL);
    }
}
