package org.example.Baek;

import java.io.*;
import java.util.Arrays;

public class B2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        int n = Integer.parseInt(bf.readLine());  // 정수 n을 읽음
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());  // 정수 배열 입력
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 출력
        for (int i : arr) {
            bw.write(i + "\n");
        }

        // BufferedWriter 플러시 및 종료
        bw.flush();
        bw.close();
    }
}
