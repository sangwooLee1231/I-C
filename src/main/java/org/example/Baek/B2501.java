package org.example.Baek;

import java.util.Scanner;

public class B2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int count = 0;

        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                arr1[count]=i;
                count++;
            }

        }
        if(b>count)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(arr1[b-1]);
        }


    }
}

