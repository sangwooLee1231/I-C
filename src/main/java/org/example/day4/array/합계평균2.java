package org.example.day4.array;

import java.util.Random;

public class 합계평균2 {
    public static void main(String[] args) {
        Random r = new Random(44);
        int[] arr1 = new int[1000];
        int sum=0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(1000)+1;
            System.out.print(arr1[i]+" ");
        }
        for(int i = 0; i < arr1.length; i++) {
            sum = arr1[i]+sum;
        }
        System.out.println(arr1[0]+arr1[2]+arr1[4]+arr1[99]+arr1[989]);
        System.out.println("합계: "+sum);
        System.out.println("평균: "+(sum/(double)arr1.length));
    }
}
