package org.example.Day5.Array2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int[][] arr = new int[4][10];
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        for (int i = 0; i < 10; i++) {
            arr[0][i] = i;
        }
        while (true) {
            System.out.println("-------------------------------------");
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[0][j] + "   ");
            }
            System.out.println(" ");
            System.out.println("-------------------------------------");
            for (int i = 1; i < 4; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(arr[i][j] + "   ");
                }
                System.out.println(" ");
            }
                System.out.print("예매 1, 종료0>>: ");
                int a = sc.nextInt();
                if (a == 1) {
                    System.out.print("좌석할 예매 행번호: >>>");
                    int b = sc.nextInt();
                    System.out.print("좌석할 예매 열번호: >>>");
                    int c = sc.nextInt();
                    if (arr[b][c] == 1) {
                        System.out.println("이미 팔렸습니다.");
                    } else {
                        System.out.println("예매 완료");
                        arr[b][c] = 1;
                        cnt++;
                    }

                }
                else if( a==0)
                {
                    break;
                }
                else
                {
                    System.out.println("잘못된 접근입니다.");
                }

            }

        System.out.println("당신의 총 예매수는 "+cnt+"매");
        System.out.println("당신의 총 금액은 "+cnt*10000+"원");
        }
    }

