package org.example.day11.review;


public class Day사용 {
    public static void main(String[] args) {
        Day day1 = new Day("공부",8,"삼성동");
        System.out.println(day1);

        Day day2 = new Day("선정릉",1,"삼성동");
        System.out.println(day2);

        Day day3 = new Day("가만히 있기",8,"삼성동");
        System.out.println(day3);

        System.out.println(Day.count);
        System.out.println(Day.sum);
        System.out.println(Day.getAvg());

    }

}

/*
static은 객체생성하지 않아도 클래스명으로 접근하여 사용할 수 있음.
static은 2가지
 -변수 : 공유
 -메서드 : 자주 사용하는 기능
사용법
- 변수 : 클래스명.변수명
- 메서드: 클래스명.메서드명()
주의
- static 메서드내에서 사용 할 수 있는 변수는
  객체생성하지 않아도 언제든지 접근할 수 있는 static 변수만 가능하다!
예제
-변수   :Color.red, Color.RED, Font.BOLD
-메서드 : Integer.parseInt("123") --> String을 int로 변환할 때
         String data = "123";
         (int)data;  // 같은 기본형이거나, 같은 참조형이거나 할때만 타입을 바꿀 수 있음.(형변환)
         String.valueOf(123) ==> int를 String으로 변환할 때

생성자 메서드--> static(변수) --> static(메서드) --> 메서드 호출 연습
1) 멤버메서드(일반메서드) : 외부에서 사용하는 경우, 객체 생성후 호출 가능
2) 생성자 메서드 : 외부에서 사용할 때 객체 생성시 자동 호출
3) static메서드 : 외부에서 아무때나 호출 가능
--> 인텔리제이 디버거(스텝인투, 스텝아웃, 스텝오버, resume)
==> 객체지향의 꽃(상속 중심) --> 추상클래스, 클래스형변환, 인터페이스
			       익명클래스, 내부클래스
==> 응용예제(ArrayList, HashSet, .....)
==> 응용프로그램(swing)
==> 최신 jdk17(+jdk8) : 람다(-->),  많은 데이터를 처리하기 위한 스트림!
==> 디자인패턴(설계 패턴) : 싱글톤, 프로토타입, 팩토리, 전략패턴



     */

