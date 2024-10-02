package org.example.Baek;

import java.util.Scanner;

public class B2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 행의 크기
        int b = sc.nextInt();  // 열의 크기

        int[][] arr = new int[a][b];  // a행 b열의 2차원 배열 생성
        int[][] arr2 = new int[a][b];
        int[][] arr3 = new int[a][b];

        // 배열의 요소를 입력받음

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j] = sc.nextInt();  // 공백으로 구분된 숫자 입력받음
                }
            }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr2[i][j] = sc.nextInt();  // 공백으로 구분된 숫자 입력받음
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr3[i][j] = arr[i][j]+arr2[i][j];      // 공백으로 받은 2차원배열 더하기
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf(arr3[i][j]+" "); //출력
            }
            System.out.println("");
        }
        sc.close();
    }
}
