package com.hackerrank;

/*Input Format --> Read some unknown  lines of input from stdin(System.in) until you reach EOF;
each line of input contains a non-empty String.*/

/*Output Format --> For each line, print the line number,
followed by a single space, and then the line content received as input.*/

import java.util.Scanner;

public class JavaEoF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        //hasNext- retrn true if loop has nextToken
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(i+" "+s);
                i++;
            }
        }

    }

