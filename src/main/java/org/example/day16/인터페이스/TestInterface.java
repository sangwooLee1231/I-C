package org.example.day16.인터페이스;

// 아이폰잭의 "주요 역할을 정의"하는 역할
public interface TestInterface {
    //설계도 역할
    //아직 완전한 클래스가 아님
    //테스트해야함, 입력으로 스트링으로 해야함
    public abstract void test(String name); // 추상메서드
    // 불완전한메서드 == 추상메서드(abstract method)
    // public abstract은 생략가능
    boolean result(int hour,int min);
    // 인터페이스는 추상메서드로만 만든다 // 기능중심으로 설계
    //            필드는 들어가지 않는다



}
