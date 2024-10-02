package org.example.day3.array;

import java.util.Arrays;
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();

        int a[] = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
        System.out.println(a[a.length-1]);

    }
}
