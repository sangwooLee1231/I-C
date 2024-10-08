package org.example.Baek;

import java.util.Arrays;
import java.util.Scanner;

public class B5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 종료 조건: 세 변이 모두 0인 경우 프로그램 종료
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 세 변을 배열에 넣고 정렬
            int[] arr1 = {a, b, c};
            Arrays.sort(arr1);

            // 삼각형 성립 여부 확인
            if (arr1[2] < arr1[0] + arr1[1]) {
                // 정삼각형 확인
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                }
                // 이등변삼각형 확인
                else if (a == b || b == c || c == a) {
                    System.out.println("Isosceles");
                }
                // 부등변삼각형 확인
                else {
                    System.out.println("Scalene");
                }
            } else {
                // 삼각형을 만들 수 없는 경우
                System.out.println("Invalid");
            }
        }
    }
}
