package org.example.day13.상속;

public class 스레드실행 {
    public static void main(String[] args) {
        EvenThread r1 = new EvenThread();
        TimeThread r2 = new TimeThread();
        r1.start();
        r2.start();
    }
}
