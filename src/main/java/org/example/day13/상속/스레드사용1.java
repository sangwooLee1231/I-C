package org.example.day13.상속;

public class 스레드사용1 {
    public static void main(String[] args) {
        //스레드 사용 3가지 단계
        //1. 스레드 상속받아 클래스 정의
        //2. 1에서 만든 스레드클래스 객체생성
        //3. 실행대기줄에 등록
        카운터스레드 t1 = new 카운터스레드();
        시각스레드 t2 = new 시각스레드();
        배열스레드 t3 = new 배열스레드();
        t1.start();
        t2.start();
        t3.start();
    }
}
