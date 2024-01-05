package com;

public class IncrementDecrement {

    static int x = 1111;

    /*We know that the static block executed first.
    Therefore, the post decrement value of x will be 1111
    and the pre decrement value will be 1109
    and the difference between the values is 2
    and the same will print on the console.*/

    static {
        System.out.println("1st static block");
        x = x-- - --x;

    }

    /*Note that the block after the static block will never get executed.*/

    {
        x = x++ + ++x;
    }


    /*---------Difference b/w i++ and ++i -------------*/
    public static void difference(int i) {

        int j = i++;
        int k = ++i;
        int a = --i;
        int b = i--;
        System.out.println("i++ " + j);
        System.out.println("++i " + k);
        System.out.println("--i " + a);
        System.out.println("i-- " + b);
    }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(x);
        IncrementDecrement.difference(5);
    }

    static {
        System.out.println("2nd static block");
    }

}


