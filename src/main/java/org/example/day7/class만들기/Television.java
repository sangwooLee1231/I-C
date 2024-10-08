package org.example.day7.class만들기;



public class Television {
    //속성(특징, 특성) : attribute, property ==> 내가 클래스 만들 때 넣을 항목들
    // 항목 : item, field(필드, *)
    //        size, price, manufacturer, retailer ==> 멤버변수
    //        다른 항목을들 선택할 수 있었지만 내가 선택한 이 항목으로 변수를 만들겠다.
   public String size; //전역변수, 자동초기화, null로 초기화! ==> 참조형변수
    public int price; // ==> 전역변수,기본형 변수, 0으로 초기화
    public String company; // 제조회사, 전역변수, NULL로 초기화

    //기능(동작) : function, method(메서드, 절차.방법)
    // 전원을 켜다, 전원을 끄다, 채널을 바꾸다
    // 멤버 메서드
    public void powerOn(){
        // 전원을 켜기 위한 방법과 절차를 여기에 쭉 쓴다.
        System.out.println("TV가 켜졌다.");
    }

    public void powerOff(){
        // 전원을 끄기 위한 방법과 절차를 여기에 쭉 쓴다.
        System.out.println("TV가 꺼졌다.");
    }
    public void changeCh(){
        // 채널을 바꾸기 위한 방법과 절차를 여기에 쭉 쓴다.
        System.out.println("채널을 바꿨다.");
    }

}

