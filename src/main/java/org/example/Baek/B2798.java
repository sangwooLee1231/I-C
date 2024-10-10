package org.example.Baek;

import java.util.Scanner;

public class B2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 카드 개수
        int b = sc.nextInt();  // 블랙잭 수치
        int[] arr = new int[a];
        int max = 0;  // 최대 합을 저장할 변수

        // 카드 수 입력 받기
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        // 3개 카드 조합을 위한 이중 반복문
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {  // j는 i + 1부터 시작
                for (int k = j + 1; k < a; k++) {  // k는 j + 1부터 시작
                    int sum = arr[i] + arr[j] + arr[k];  // 카드의 합
                    // 블랙잭 수치를 넘지 않으면서 최대 합 갱신
                    if (sum <= b && sum > max) {
                        max = sum;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(max);
    }
}
