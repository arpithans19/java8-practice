package com.patternPrograms;

/*print a pattern (reverse triangle of *) in 5 line*/

public class PatternPriniting {
    public static void main(String[] args) {

        for (int i=0;i<10;i++){

//            System.out.println("*");
            for(int j=1;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

