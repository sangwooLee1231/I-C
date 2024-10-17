package org.example.day12.상속;

import java.util.Date;

public class 쓰레드2 extends Thread {

    @Override
    public void run() {

    Date date = new Date();
    for(int i = 0; i<3000; i++)
    {
        System.out.println(date);
    }
}
}
