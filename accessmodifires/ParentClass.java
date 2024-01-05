package com.accessmodifires;

public class ParentClass {

    // public method is accessble by child class
    public int sum(int a,int b) {

        int sum=a+b;
        return sum;
    }

//    private method is accessble by child class
    private int sumOfTwonumber(int c ,int d) {
       int s=c+d;
        return s;
    }

}
