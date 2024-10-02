package org.example.Baek;

import java.util.Scanner;

public class B2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 하루에 올라가는 거리
        int b = sc.nextInt(); // 밤에 내려가는 거리
        int c = sc.nextInt(); // 목표 높이

        // 수학적 계산으로 최소 일수를 구함
        int days = (c - b) / (a - b); // 나누기 결과가 정수일 경우
        if ((c - b) % (a - b) != 0) { // 나머지가 있으면 하루를 더해줌
            days++;
        }

        System.out.println(days);
        sc.close(); // Scanner 객체 닫기
    }
}