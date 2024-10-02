package org.example.Baek;

import java.util.Scanner;

public class B2563 {
    public static void main(String[] args) {
        int a,b,n;
        int cnt=0;
        int[][] arr = new int[101][101];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i<n; i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            for(int j = 0; j<10; j++)
                for(int k = 0; k<10; k++)
                    arr[a+j][b+k] = 1;
        }

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                if(arr[i][j] == 1)
                {
                    cnt++;
                }

            }
        }
        System.out.println(cnt);

    }
}
