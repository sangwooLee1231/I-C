package org.example.day12.상속;

public class Qu1Thread {
    public static void main(String[] args) {
        Thread t1 = new Qu1();
        Thread t2 = new Qu2();
        t1.start();
        t2.start();
    }
}
