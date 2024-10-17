package org.example.day12.상속;

public class 쓰레드메인  {

    public static void main(String[] args) {

        Thread t1 = new 쓰레드1();
        Thread t2 = new 쓰레드2();
        Thread t3 = new 쓰레드3();



        t1.start();
        t2.start();
        t3.start();
    }
}
