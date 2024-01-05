package com.hackerrank;

/*Static Intializer Block-->Static initialization blocks are executed when the class is loaded,
and you can initialize static variables in those blocks*/


/*Input Format-->
        There are two lines of input.
        The first line contains : the breadth of the parallelogram.(b)
        The next line contains : the height of the parallelogram.(h)


Output Format-->
        If both values are greater than zero,
        then the main method must output the area of the parallelogram(a=bh).Otherwise,
        print "java.lang.Exception: Breadth and height must be positive" without quotes.*/

import java.util.Scanner;

public class JavaStaticIntializerBlock {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enbter 2 values");
        int i = sc.nextInt();
        int j = sc.nextInt();
        if (i > 0 && j > 0) {
            int a = i * j;
            System.out.println(a);

        } else {
            throw new Exception("\"java.lang.Exception: Breadth and height must be positive");
        }
    }
}

/*HackerRank Answer*/


//public class Solution {
//    static int B, H;
//    static boolean flag = true;
//    static Scanner Scn = new Scanner(System.in);
//
//    static {
//        B = Scn.nextInt();
//        H = Scn.nextInt();
//
//        if (B <= 0 || H <= 0) {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//            flag = false;
//        }
//    }
//
//    public static void main(String[] args) {
//        if (flag) {
//            int area = B * H;
//            System.out.print(area);
//        }
//    }
//}