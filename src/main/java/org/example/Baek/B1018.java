package org.example.Baek;

import java.util.Scanner;

public class B1018 {

    public static void main(String[] args) {

        // 'W'로 시작하는 체스판 패턴
        char[][] whiteFirstPattern = {
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
        };

        // 'B'로 시작하는 체스판 패턴
        char[][] blackFirstPattern = {
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
                {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
                {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
        };

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 행의 크기
        int b = sc.nextInt(); // 열의 크기
        sc.nextLine(); // 버퍼 비우기

        char[][] arr = new char[a][b];

        // 입력 받기
        for (int i = 0; i < a; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < b; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int minChanges = Integer.MAX_VALUE;

        // 8x8 체스판을 만들 수 있는 모든 위치 확인
        for (int i = 0; i <= a - 8; i++) {
            for (int j = 0; j <= b - 8; j++) {
                minChanges = Math.min(minChanges, getChanges(arr, whiteFirstPattern, i, j));
                minChanges = Math.min(minChanges, getChanges(arr, blackFirstPattern, i, j));
            }
        }

        System.out.println(minChanges);
    }

    // 주어진 위치에서 패턴과 몇 칸을 바꿔야 하는지 계산하는 함수
    public static int getChanges(char[][] board, char[][] pattern, int row, int col) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[row + i][col + j] != pattern[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
