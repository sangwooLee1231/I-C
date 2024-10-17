package org.example.day12.상속;

public class Q1Thread {
    public static void main(String[] args) {
        Thread t1 = new Q1();
        Thread t2 = new Q2();

        t1.start();
        t2.start();
    }
}
