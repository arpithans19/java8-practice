package com.interview;

public class CompareValuesWrapperClass {
    public static void main(String[] args) {

        Integer num1=100;
        Integer num2=100;
        Integer num3=500;
        Integer num4=500;

//        In Java, when you use the == operator to compare objects (such as Integer),
//        you are checking for reference equality, not the value equality.
//        In the case of integers, Java caches certain values (typically in the range -128 to 127),

        if(num1==num2){
            System.out.println("num1==num2");
        }
        else {
            System.out.println("num1!=num2");

        }
        if(num3==num4){
            System.out.println("num3==num4");
        }
        else {
            System.out.println("num3!=num4");
        }
    }
}
