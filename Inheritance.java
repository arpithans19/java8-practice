package com;


class Base {
    public Base() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public Derived() {
        System.out.println("Derived");
    }
}

class DeriDerived extends Derived {
    public DeriDerived   () {
        System.out.println("DeriDerived");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Derived();
        System.out.println("--------");
        //DeriDerived d=new Base();   //java: incompatible types

        Derived d=new Derived();
        System.out.println("--------");
        Derived dd=new DeriDerived();
    }
}

