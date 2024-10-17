package org.example.day13.예외처리;

public class 문제발생클래스 {
    public static void main(String[] args) {
        System.out.println("1. 나는 프린트가 될 예정");

      try {
          System.out.println("2. 문제 발생 코드" + 10 / 0);
      } catch (ArithmeticException e) {
          System.out.println("수학 실행할 때에 문제발생");
          e.printStackTrace(); //발생한 문제에 대해 구체적으로 프린트
          System.out.println(e.getMessage()); // 간단하게 문제에 대해 String으로 리턴
      }
        System.out.println("3. 과연 나는 프린트가 될까요?");
    }
}
