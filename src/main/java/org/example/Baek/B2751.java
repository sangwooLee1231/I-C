package org.example.Baek;

import java.util.Arrays;
import java.util.Scanner;

public class B2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.stream(arr).sorted().distinct().forEach(System.out::println);
    }
}
