package com.loops;

public class NamedLoops {
    public static void main(String[] args) {

        loop1:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                if (i == 3)
                    break loop1;

                System.out.println(j);
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}

