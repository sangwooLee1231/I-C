package org.example.Baek;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class B2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }




    }
}
