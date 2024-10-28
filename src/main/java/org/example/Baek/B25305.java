package org.example.Baek;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class B25305 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄 입력 처리 (a: 총 학생 수, b: 상을 받을 인원)
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 배열 초기화 및 입력 처리
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열 정렬
        Arrays.sort(arr);

        // b번째로 큰 수 출력 (오름차순 정렬 후 상위 b번째 성적은 a - b 인덱스에 위치)
        System.out.println(arr[a-b]);

    }
}
