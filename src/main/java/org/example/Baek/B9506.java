package org.example.Baek;

import java.util.Scanner;

public class B9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            int a = sc.nextInt(); // 사용자 입력 받음
            if(a == -1) // 입력값이 -1이면 종료
            {
                break;
            }

            int[] arr1 = new int[a]; // 배열 생성
            int count = 0;
            int sum = 0;

            // 1부터 a-1까지 확인하여 약수 저장
            for(int i = 1; i < a; i++)
            {
                if(a % i == 0) {
                    arr1[count] = i; // 약수 저장
                    count++;
                    sum += i; // 약수들의 합 계산
                }
            }

            if(a == sum) {
                // 완전수일 경우 출력
                System.out.print(a + " = ");
                for(int i = 0; i < count; i++) {
                    if(i == count - 1) { // 마지막 약수에는 + 없이 출력
                        System.out.println(arr1[i]);
                    } else {
                        System.out.print(arr1[i] + " + ");
                    }
                }
            } else {
                // 완전수가 아닐 경우 출력
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}
