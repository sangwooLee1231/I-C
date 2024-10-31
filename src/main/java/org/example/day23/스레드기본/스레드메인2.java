package org.example.day23.스레드기본;

public class 스레드메인2 {
    public static void main(String[] args) {
        //스레드 객체 생성
        Thread t1 = new Thread(new 스레드만들기1());
        Thread t2 = new Thread(new 스레드만들기2());

        t1.start();
        t2.start();



        //메인스레드와 함께 3개의 스레드를 동시에 처리하는
        //목록으로 등록해줘!

    }
}
