package org.example.day23.스레드기본;

public class 스레드메인람다화살표 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->  {
                for(int i=0;i<100;i++)     {
                    System.out.println("==> 나는 별!!!");
                }
        });

        Thread t2 = new Thread(() -> {
                for(int i=0;i<100;i++)     {
                    System.out.println("==> 나는 달러!!!");
            }
        });
        t1.start();
        t2.start();

    }
}
