package org.example.day2.review;

public class Test2 {
    public static void main(String[] args) {
        int x = 333;
        int y = 222;

        int sum = x + y;
        int minus = x - y;
        int mul = x * y;
        int mod = x % y;
        int div = x / y;

        System.out.println("sum = " + sum);     //결합연산자
        // 결합연산자는 피연산자가 하나라도 스트링이면!
        // 산술연산자는 정수 + 정수 이면 결과는 정수
        // 산술연상자는 하나라도 실수이면 결과는 실수

        // 비교연산자, 논리연산자의 결과는 무조건 1 or 0(True or false)

        System.out.println("minus = " + minus);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);
        System.out.println(("mul = ")+mul);
        System.out.println((x==y));
        System.out.println((x>=y));

    }
}
