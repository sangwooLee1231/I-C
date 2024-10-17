package org.example.day13.상속;

import java.util.Date;

public class 배열스레드 extends Thread{
    String[] foods = {"1.png","2.png","3.png","4.png","5.png"};

    public void run(){
        for(int i=0;i<foods.length;i++) {
            System.out.println("배열>> "+foods[i]);
            try {
                Thread.sleep(5000);
            } catch(InterruptedException e) {
                System.out.println("문제가 생김");
            }
            }
      }
    }


