package com.patternPrograms;

public class NumberPyramid {
    public static void main(String[] args) {

        int rows = 5;
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");


            }
            System.out.println();
        }


        System.out.println("--------Full Number Pyramid--------");

        int k = 0, count = 0, count1 = 0;
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= 5 - i; ++j) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i + k) + " ");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + " ");
                }

                ++k;
            }
            count1 = count = k = 0;

            System.out.println();
        }
    }
}

