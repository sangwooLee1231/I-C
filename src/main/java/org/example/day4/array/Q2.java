package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
       Random r = new Random();

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(100);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(100);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1[arr1.length-1]+arr2[arr2.length-1]);
        System.out.println(arr1[0]+arr2[0]);


    }
}
