package org.example.day12.상속;

public class Q2 extends Thread {
    @Override
    public void run() {
        for(int i=1000;i>=1;i--)
        {
            System.out.println(" 감소"+i);
        }
    }
}

