package com.interview.methodoverloadingscenario;

public class MethodOverloadingExample {

//    public void print(String str){
//        System.out.println("printing str");
//    }
        public void print(Object str){
        System.out.println("printing Object");
    }
    public void print(int i){
        System.out.println("printing integr");
    }


    public static void main(String[] args) {

        MethodOverloadingExample example=new MethodOverloadingExample();
        example.print(null);

    }
}
