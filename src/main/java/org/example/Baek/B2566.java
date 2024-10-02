package org.example.Baek;

import java.util.Scanner;

public class B2566  {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];        // 9*9 행렬
        Scanner sc = new Scanner(System.in);
        int max=0; //최댓값

        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
                arr[i][j] = sc.nextInt();       // 행렬 입력받기
        }

        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
                if(arr[i][j] > max)
                {
                    max = arr[i][j];        // 최댓값 찾기
                }
        }
        System.out.println(max);
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
                if(arr[i][j] == max)
                {
                    System.out.println((i+1)+" "+(j+1)); //출력
                }
        }


    }
}



