package com.interview;

public class Factorial {

    /*Normal approach- iterative approach*/
//    public static int main(String[] args) {

//       int fact=1;
//       int number=7;
//       for(int i=1;i<=7;i++){
//           fact=fact*i;
//       }
//
//        /*---------------------------------*/
//        if (number == 0 || number == 1) {
//            System.out.println("1");
//        } else {
//            System.out.println(fact);
//        }
//
//
//    }

    /* -----------Recursive Approach-----------*/

   public static int factorial(int n){
       if(n==0 || n==1){
           return 1;
       }
       else {
           return n*factorial(n-1);
       }
   }

    public static void main(String[] args) {

       System.out.println(factorial(5));
    }
}
