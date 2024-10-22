package org.example.day16.추상클래스;

public class ApplePhone1 extends ApplePhone {
    // 추상클래스를 상속받은 경우
    // 무조건!!! 추상메서드를 일반메서드로 오버라이드해서 구현해줘야함

       public void camera() {
           System.out.println("렌즈 1개짜리 카메라로 찍다.");
       }


}

