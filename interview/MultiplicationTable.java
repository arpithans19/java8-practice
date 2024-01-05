package com.interview;

public class MultiplicationTable {
    public static void main(String[] args) {

        int n=2;
        System.out.println("using for loop");
        for(int i=1;i<=10;i++){
            System.out.printf("%d*%d=%d\n",n,i,n*i);
        }

        /*using while loop*/
        int i=1;
        System.out.println("using while loop");
        while(i<=10){
            System.out.printf("%d*%d=%d\n",n,i,n*i);
            i++;

        }
    }
}
