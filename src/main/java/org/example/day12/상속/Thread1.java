package org.example.day12.상속;


public class Thread1 extends Thread{


    // run() : 동시에 실행하고 싶은 코드..
    // start() : run()안에 있는 코드를 동시에 실행하라고 시작..
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("증가: "+i);
        }
    }
}
