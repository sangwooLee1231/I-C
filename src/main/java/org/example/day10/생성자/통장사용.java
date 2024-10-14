package org.example.day10.생성자;

public class 통장사용 {
    public static void main(String[] args) {
        //인스턴스 변수 --> 3개
        //인스턴스 변수는 생성된 객체(클래스의 인스턴스)의 실제값(인스턴스)을
        //저장하기 위한 변수
        //==> 객체생설할 때마다 힙영역에 생긴다.!
        통장 dad = new 통장("홍길동", "050505", 10000);
        System.out.println(dad);
        System.out.println(통장.count);

        통장 me = new 통장("홍길순", "090505", 5000);
        System.out.println(me);
        System.out.println(통장.count);
    }

}