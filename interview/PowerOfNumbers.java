package com.interview;

import java.util.Scanner;

/*find power of  2 numbers ==> input Base=2, power =3 , o/p==> 8*/
public class PowerOfNumbers {
    public static void main(String[] args) {

        int base=2;
        int power=3;

        double powerofBase=Math.pow(base,power);
        System.out.println(powerofBase);


        Scanner sc=new Scanner(System.in);
        System.out.println("enter base and power");
        int b=sc.nextInt();
        int p=sc.nextInt();

        int pow=power(b,p);

        System.out.println("Power of base is: "+pow);


    }

    private static int power(int b, int p) {

        int power=1;
        for(int i=1;i<=p;i++){
            power=power*b;
        }
        return power;
    }
}
