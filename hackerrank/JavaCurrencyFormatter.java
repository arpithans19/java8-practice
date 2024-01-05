package com.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*Output Format

        On the first line, print US: u where  is  formatted for US currency.
        On the second line, print India: i where  is  formatted for Indian currency.
        On the third line, print China: c where  is  formatted for Chinese currency.
        On the fourth line, print France: f, where  is  formatted for French currency.

  Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

 */


public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        String us = "$" + payment;
        String india = "Rs." + payment;
        String china = " " + payment;
        String france = " " + payment;

        NumberFormat n=NumberFormat.getCurrencyInstance(Locale.US);
        String us1=n.format(payment);

        NumberFormat n2=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india2=n2.format(payment);

        NumberFormat n3=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china2=n3.format(payment);

        NumberFormat n4=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france2=n4.format(payment);


//
        System.out.println("US: " +us+" "+ us1);
        System.out.println("India: " + india +" "+ india2);
        System.out.println("China: " + china+" "+ china2);
        System.out.println("France: " + france+" "+ france2);


    }

}


