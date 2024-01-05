package com.accessmodifires;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {

        ChildClass cc=new ChildClass();

        //accessing the public method
        cc.sum(4,9);

        System.out.println(cc.sum(4,3));
    }

}
