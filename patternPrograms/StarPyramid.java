package com.patternPrograms;

public class StarPyramid {
    public static void main(String[] args) {
        int rows = 5;


        /*for inverted pyramid i should be like this and j same as now*/
//        for (int i=5;i>=1;--i){
        for (int i = 1; i <= rows; ++i) {

            for (int j = 1; j <= i; ++j) {

                /*for number pyramid print j*/
                System.out.print("* ");

            }
            System.out.println();
        }



/*--------------------------------------------------------------------------------------------*/
        System.out.println("---------Inverted Pyramid----------------");

        for (int i = 5; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {

                /*for number pyramid print j*/
                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println("---------Number Pyramid----------------");

        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {

                /*for number pyramid print j*/
                System.out.print(j + " ");

            }
            System.out.println();
        }
        System.out.println("---------Alphabet Pyramid----------------");

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

