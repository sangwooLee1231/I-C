package org.example.day13.상속;

public class TimeThread extends Thread {

    public void run() {
        for(int i=100;i<500;i++)
        {
            if(i%2==0)
                System.out.println("수: "+i);

            try{
                Thread.sleep(350);

            } catch (InterruptedException e) {
                e.printStackTrace();
        }

        }

    }
}
