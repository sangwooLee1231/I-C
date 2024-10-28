package org.example.Baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[10001];  // 숫자의 범위가 1 ~ 10000이므로 크기가 10001인 배열 생성

        // 입력을 받아서 해당 숫자의 카운트 증가
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        StringBuilder sb = new StringBuilder();

        // 카운트 배열을 이용해 정렬된 숫자 출력
        for (int i = 1; i < 10001; i++) {
            while (count[i] > 0) {  // count[i]가 0보다 크면 그 숫자를 출력
                sb.append(i).append("\n");
                count[i]--;
            }
        }

        // 한 번에 출력
        System.out.println(sb);
    }
}
