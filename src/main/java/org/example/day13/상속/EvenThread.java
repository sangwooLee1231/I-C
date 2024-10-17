package org.example.day13.상속;

import java.time.LocalTime;

public class EvenThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            LocalTime now = LocalTime.now();
            System.out.println(now.getHour() + "시 " + now.getMinute() + "분 " + now.getSecond()+"초");

            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
