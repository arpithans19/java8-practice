package com.interview;

public class ExceptionTryCatchBlock {
    public static void main(String[] args) {
        int a=1;
        int b=4;
        int c=0;
        try{
            System.out.println("in try");
            int d=a/0;
            System.out.println(d);
        }
//        catch (ArithmeticException e){
//            System.out.println("ArithmeticException occurs");
//        }
        catch (Exception e){
            System.out.println("Exception occurs");
            System.exit(0);
        }

        finally {
            System.out.println("finally");
        }
    }
}
