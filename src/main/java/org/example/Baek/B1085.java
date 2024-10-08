package org.example.Baek;

import java.util.Scanner;

public class B1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int min = 1000;
        int[] arr1 = {a,b,c-a,d-b};



        // c-a b-d a b 중의 최소값

        for(int i =0;i<arr1.length;i++)
        {
            if(arr1[i]<min)
            {
                min = arr1[i];
            }
        }
        System.out.println(min);

    }
}
