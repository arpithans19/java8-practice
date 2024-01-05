package com;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        /*Finding sum of natural number*/
        int n=5;
       int sum=0;
//        for(int i=1;i<=n;i++){
//            sum=sum+i;
//        }
//        System.out.println("using for loop="+sum);


        /*using do-while*/
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.println(sum);
    }
}
