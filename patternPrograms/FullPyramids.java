package com.patternPrograms;

public class FullPyramids {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 5; ++i, k = 0) {
            for (int j = 1; j <= 5 - i; ++j) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }

        System.out.println("----------Inverted Full pyramid--------");

        int temp=9;
        int data=8;
        System.out.println(temp&data);


        int []x={1,2,3,4};
        int []y=x;
        x=new int[2];
        for(int i=0;i<x.length;i++){
            System.out.println(y[i]+" ");
        }
    }
}
