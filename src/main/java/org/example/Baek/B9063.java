package org.example.Baek;

import java.util.Scanner;

public class B9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // 점의 개수 입력
        int[] arr1 = new int[a];  // x좌표 배열
        int[] arr2 = new int[a];  // y좌표 배열
        int max1 = Integer.MIN_VALUE;  // x좌표의 최댓값
        int min1 = Integer.MAX_VALUE;  // x좌표의 최솟값
        int max2 = Integer.MIN_VALUE;  // y좌표의 최댓값
        int min2 = Integer.MAX_VALUE;  // y좌표의 최솟값

        // 점들의 좌표 입력
        for(int i=0; i<a; i++) {
            int b = sc.nextInt();  // x좌표
            int c = sc.nextInt();  // y좌표
            arr1[i] = b;
            arr2[i] = c;
        }

        // x좌표 최댓값, 최솟값 계산
        for(int i=0; i<a; i++) {
            if(arr1[i] > max1) {
                max1 = arr1[i];
            }
            if(arr1[i] < min1) {
                min1 = arr1[i];
            }
        }

        // y좌표 최댓값, 최솟값 계산
        for(int i=0; i<a; i++) {
            if(arr2[i] > max2) {
                max2 = arr2[i];
            }
            if(arr2[i] < min2) {
                min2 = arr2[i];
            }
        }

        // 직사각형의 가로(width)와 세로(height) 계산
        int width = max1 - min1;  // x좌표 차이
        int height = max2 - min2;  // y좌표 차이

        // 직사각형의 넓이 출력
        System.out.println(width * height);
    }
}
