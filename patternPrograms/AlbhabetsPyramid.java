package com.patternPrograms;

public class AlbhabetsPyramid {
    public static void main(String[] args) {

        char firstChar = 'a';
        char lastChar = 'f';
        for (int i = 1; i <= (lastChar - 'a' + 1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(firstChar + " ");

            }
            ++firstChar;
            System.out.println();
        }


    }
}
