package org.example.Baek;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class B2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        sort(arr);
        System.out.println(sum/5);
        System.out.println(arr[2]);


    }
}