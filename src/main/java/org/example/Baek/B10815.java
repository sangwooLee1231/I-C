package org.example.Baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class B10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int b = Integer.parseInt(br.readLine());
        int[] arr1 = new int[b];

        for (int i = 0; i < b; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }
}
