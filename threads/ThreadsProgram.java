package com.threads;

//don't use public here
class MyThreads extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadsProgram {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t = new MyThreads();
        t.run();

    }
}
