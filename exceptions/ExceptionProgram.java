package com.exceptions;

public class ExceptionProgram {
    public static void main(String[] args) {
        System.out.println("a");
        try{
            int a=1/0;
            System.out.println("b");
            throw new IllegalArgumentException();

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch (RuntimeException e){
            System.out.println("c");
        }

        finally {
            System.out.println("d");
        }
        System.out.println("e");
    }
}
