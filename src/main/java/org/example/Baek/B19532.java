package org.example.Baek;

import java.util.Scanner;

public class B19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a, b, c, d, e, f 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        // x와 y를 찾기 위한 반복문
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    System.out.println(x + " " + y);
                    return; // 값을 찾으면 프로그램 종료
                }
            }
        }
    }
}
