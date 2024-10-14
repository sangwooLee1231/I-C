package org.example.Baek;

import java.util.Scanner;

public class B2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        // 5로 최대한 나누기
        while (a >= 0) {
            if (a % 5 == 0) {  // 5로 나눠떨어지면
                count += a / 5; // 5로 나눈 봉지 개수 추가
                System.out.println(count);
                return;
            }
            // 5로 나누어떨어지지 않으면 3kg 봉지를 하나 추가
            a -= 3;
            count++;
        }

        // 정확하게 나누어 떨어지지 않으면 -1 출력
        System.out.println(-1);
    }
}
