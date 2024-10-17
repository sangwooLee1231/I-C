package org.example.day12.상속;

public class Qu1 extends Thread {
    public void run() {
        for(int i=0;i<5000;i++)
        {
            System.out.println("*");
        }
    }
}
