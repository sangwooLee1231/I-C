package org.example.Baek;

import java.util.Scanner;

public class B1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        int num = 666;

        // N번째로 666이 포함된 숫자를 찾는 반복문
        while (true) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }

            // N번째 숫자를 찾으면 출력하고 종료
            if (count == N) {
                System.out.println(num);
                break;
            }

            num++;
        }
    }
}
