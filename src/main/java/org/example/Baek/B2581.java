package org.example.Baek;

import java.util.Scanner;

public class B2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 시작 값
        int b = sc.nextInt();  // 끝 값
        int count1;            // 소수 여부 판단을 위한 카운트
        int count2 = 0;        // 소수 개수 카운트
        int sum = 0;           // 소수의 합
        int min = -1;          // 첫 번째 소수를 저장할 변수 (초기값은 -1로 설정)
        int[] arr2 = new int[b - a + 1];  // 소수를 저장할 배열

        // a부터 b까지 소수 찾기
        for (int i = a; i <= b; i++) {
            count1 = 0;  // 소수 판단 초기화
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count1++;  // 나누어 떨어지면 카운트 증가
                }
            }
            // 소수일 경우 처리 (나누어 떨어진 횟수가 2번이면 소수)
            if (count1 == 2) {
                arr2[count2] = i;  // 소수를 배열에 저장
                count2++;
                sum += i;  // 소수의 합 계산
                if (min == -1) {
                    min = i;  // 첫 번째 소수 저장
                }
            }
        }

        // 결과 출력
        if (count2 > 0) {
            System.out.println("소수의 합: " + sum);
            System.out.println("첫 번째 소수: " + min);
        } else {
            System.out.println("-1");  // 소수가 없을 경우
        }
    }
}

