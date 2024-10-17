package org.example.day12.상속;

public class Q1 extends Thread{
    public void run() {
        for(int i=1;i<=1000;i++)
        {
            System.out.println(" 증가"+i);
        }
    }
}
