package org.example.Baek;

import java.util.Scanner;

public class B10798 {
    public static void main(String[] args) {
        char[][] arr = new char[5][15];  // 5행 15열의 배열 선언
        Scanner sc = new Scanner(System.in);

        // 각 줄을 입력받아 배열에 저장
        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine();  // 한 줄씩 입력
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);  // 입력된 문자열의 각 문자를 배열에 저장
            }
        }

        // 세로로 읽어서 출력
        for (int j = 0; j < 15; j++) {  // 열을 기준으로 반복
            for (int i = 0; i < 5; i++) {  // 각 열에서 행을 순차적으로 출력
                if (arr[i][j] != '\0') {  // null 문자가 아닌 경우만 출력
                    System.out.print(arr[i][j]);
                }
            }
        }

        sc.close();
    }
}

