package org.example.Baek;

import java.util.Scanner;

public class B2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        String s = sc.next();  // 진법으로 표현된 숫자 입력
        int a = sc.nextInt();  // 진법 입력

        // 진법 변환
        int result = Integer.parseInt(s, a);  // a진법의 문자열 s를 10진법으로 변환

        // 결과 출력
        System.out.println(result);
    }
}

