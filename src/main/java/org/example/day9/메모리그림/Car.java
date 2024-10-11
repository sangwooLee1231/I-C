package org.example.day9.메모리그림;

public class Car {
    // 필드 2개 --> 멤버변수, 전역변수(자동초기화)
    int size;
    int speed;
    public String print(){
        return size + " " + speed;
    }
    // 메서드 2개 --> 멤버메서드


    public void hi()
    {
        //메서드 정의 --> 실행되지 않음, 호출했을 때 실행!
        int temp = 10; // 지역변수(초기화x), 기본형
        System.out.println("속도를 Speed up!" + temp);
        // 내 클래스내에서는 함수와 변수를 마음대로 불러서 쓸 수 있다.
        // 외부에서 참조형 변수 필요!
        System.out.println(print());

    }



}
