package com.interview;

public class Methods {
    public void print(Integer i){
        System.out.println("Integer");
    }
    public void print(int i){
        System.out.println("int");
    }
    public void print(Long l){
        System.out.println("long");
    }
    public static void foo(int... i) {
        System.out.println("foo(int ...)");
    }
    public static void foo(short sh){
        System.out.println("short");
    }

    public static void main(String[] args) {
        Methods m=new Methods();
        m.print(10);
        foo(10);

    }
}
