package org.example.Baek;

import java.util.Scanner;

public class B24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = (n - 2) * (n - 1) * n / 6;  // 3중 루프의 계산을 수식으로 변환
        System.out.println(cnt);
        System.out.println(3);  // 시간 복잡도 계수
    }
}


/*
        int sum=0;
        int n=7;
        for(int i = 1;i<=n-2;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                for(int k=j+1;k<=n;k++)
                {
                    sum++;
                }
            }
        }
        System.out.println(sum);

                Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
 */
