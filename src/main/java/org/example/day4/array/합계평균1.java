package org.example.day4.array;

import java.util.Scanner;

public class 합계평균1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("숫자 입력: ");
            arr1[i] = sc.nextInt();
            sum = arr1[i]+sum;
        }
        System.out.println("--------------------");
        System.out.println("합계: "+sum);
        System.out.printf("평균: %.8f",(sum/(double)arr1.length));
    }
}
