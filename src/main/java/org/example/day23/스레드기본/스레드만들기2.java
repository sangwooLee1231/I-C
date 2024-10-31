package org.example.day23.스레드기본;

public class 스레드만들기2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100; i++) {
            System.out.println("나는 달러!!!");
        }
    }
}