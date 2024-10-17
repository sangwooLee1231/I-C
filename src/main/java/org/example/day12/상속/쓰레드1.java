package org.example.day12.상속;

public class 쓰레드1 extends Thread {
    public void run() {
        for(int i=500;i>=1;i--)
            System.out.println(i);
    }

}
