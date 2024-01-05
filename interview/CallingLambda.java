package com.interview;

@FunctionalInterface
interface j {
    public void abstractMethod();
}

@FunctionalInterface
interface a {
    public void astractMethod2(int a, int b);
}

interface st {
    public int abstractSring(String str);

}


interface squ{
    public int squareRoot(int i);
}

class Demo implements j, a, st,squ {

    public void abstractMethod() {
        System.out.println("abstractMethod FunctionImplementaion");

    }

    public void astractMethod2(int a, int b) {
        System.out.println(a + b);
    }

    public int abstractSring(String str) {
        return str.length();
    }


    public int squareRoot(int i) {
        return  i*i;
    }
}

public class CallingLambda {
    public static void main(String[] args) {


        j inn = new Demo();
        inn.abstractMethod();

        a ini = new Demo();
        ini.astractMethod2(3, 5);

        st ins = new Demo();
        System.out.println(ins.abstractSring("Arpitha"));

        //creating object for interface
        squ sq=new Demo();
        System.out.println(sq.squareRoot(9));

    }
}


