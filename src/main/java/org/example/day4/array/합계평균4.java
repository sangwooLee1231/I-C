package org.example.day4.array;

import java.util.Random;

public class 합계평균4 {
    public static void main(String[] args) {
        Random r = new Random(555);
        int[] arr1= new int[1000];
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(100)+1;
            if(arr1[i]>=80)
            {
                count1++;
            }
            else if(arr1[i]>=70)
            {
                count2++;
            }
            else if(arr1[i]>=50)
            {
                count3++;
            }
            else
            {
                count4++;
            }
        }
        System.out.println("80이상 수의 갯수: "+count1);
        System.out.println("70~79인 수의 갯수: "+count2);
        System.out.println("50~69인 수의 갯수: "+count3);
        System.out.println("49보다 낮은 수의 갯수: "+count4);
    }
}
