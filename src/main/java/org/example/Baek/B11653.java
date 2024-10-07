package org.example.Baek;

import java.util.Scanner;

public class B11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 소인수분해할 숫자
        int count1 = 0;
        int[] arr1 = new int[a];  // 소인수를 저장할 배열

        // 소인수분해 로직
        for (int i = 2; i <= a; i++) {
            while (a % i == 0) {  // a가 i로 나누어떨어질 때까지 나누기
                arr1[count1] = i;  // 소인수를 배열에 저장
                count1++;          // 소인수 개수 카운트
                a /= i;            // a를 i로 나눔
            }
        }

        // 소인수 출력
        for (int i = 0; i < count1; i++) {
            System.out.println(arr1[i]);
        }
    }
}
