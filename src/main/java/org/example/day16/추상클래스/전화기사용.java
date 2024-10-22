package org.example.day16.추상클래스;

public class 전화기사용 {
    public static void main(String[] args) {
       // MegaPhone p1 = new MegaPhone(); //X, 인터페이스는 객체생성이 불가능함.
       // ApplePhone p2 = new ApplePhone(); //X, 추상클래스는 객체생성이 불가능함.
        ApplePhone1 p3 = new ApplePhone1(); //O 일반클래스라 가능
        ApplePhone2 p4 = new ApplePhone2(); //O 일반클래스라 가능
        ApplePhone p5 = p3; // --> ApplePhone이 p3보다 더 큰 개념이라 가능
        System.out.println((MegaPhone.DATA));

    }
}
