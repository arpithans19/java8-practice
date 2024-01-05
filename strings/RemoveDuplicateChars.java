package com.strings;

/* Remove the duplicate characters from give String or from entered string*/
public class RemoveDuplicateChars {
    public static void removeDuplicates(String str)
    {
        //new String
        String st = new String();

        int length = str.length();

        for (int i = 0; i < length; i++)
        {
            // store the character available at ith index in the string
            char charAtPosition = str.charAt(i);

            // check the index of the charAtPosition.
            // If the indexOf() method returns true add it to the resulting string
            if (st.indexOf(charAtPosition) < 0)
            {
                st += charAtPosition;
            }
        }

        System.out.println(st);
    }
    public static void main(String[] args) {

        String str = "traffic";

        removeDuplicates(str);

    }
}
