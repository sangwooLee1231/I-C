package org.example.Baek;

import java.util.Scanner;

public class B24265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        long sum=0;
        for(int i=0;i<a; i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
        System.out.println(2);

    }

    /*
    public class MenOfPassion(int A[],int n)
    {
        int sum = 0;
        for(int i=1;i<n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                sum = sum+(A[i]*A[j]);
            }
        }
    }

     */
}
