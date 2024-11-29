package org.example.Baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int[][] arr = new int[a][2];

        // 좌표 입력
        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // x 좌표
            arr[i][1] = Integer.parseInt(st.nextToken()); // y 좌표
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1]; // == o1[1] - o2[1]
                }
                return Integer.compare(o1[0], o2[0]); // == o1[0] - o2[1]
            }
        });

        // 결과 출력
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
