package org.example.Baek;

import java.util.Arrays;
import java.util.Scanner;

public class B14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr1 = {a,b,c};
        int sum=0;

        Arrays.sort(arr1);

        while(true) {
            if (arr1[0] + arr1[1] > arr1[2]) {
                break;
            }
            arr1[2]--;
        }
        for(int i=0;i<arr1.length;i++) {
            sum = sum + arr1[i];
        }
        System.out.println(sum);
    }

}
