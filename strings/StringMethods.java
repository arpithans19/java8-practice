package com.strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        /*The statement is commented but not so
        // \u000d is a new line Unicode character.*/
        //\u000d System.out.println("Hello");

        int i = 20 + +9 - -12 + +4 - -13 + +19;
        /*int i=20+ (+9)- (-12)+ (+4)- (-13)+ (+19);
        i=20+9+12+4+13+19
        i=77*/
        System.out.println(i);

        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(sb1.toString() == s1); //false-tostring is used to convert numbers to string
        System.out.println(sb1.toString().equals(s1));//true


//        The Unicode declaration must be enclosed in single quotes: '\u004e'
        char[] ca = {0x4e, '\u004e', 78};
        System.out.println((ca[0] = ca[1]) + " " + (ca[0] = ca[2]));


        String str = "ONE" + 1 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
        System.out.println(str);

        //MIN_VALUE is negative (i.e. -2^31),
        //The Double.MIN_VALUE is 2^-1074
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

        String str1 = "hello";
        String str2 = new String("hello");

        /*The method intern() creates an exact copy of a String object in the heap memory
        and stores it in the String constant pool.*/
        str2 = str2.intern();
        System.out.println(str2.intern());
        System.out.println(s1 == s2);

        String string="Java|Python|Hadoop";
        String[] array = string.split("\\|");
        System.out.println(Arrays.toString(array));



    }

}
