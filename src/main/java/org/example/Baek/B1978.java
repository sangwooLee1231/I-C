package org.example.Baek;

import java.util.Scanner;

public class B1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int count2 =0;

        for(int i = 0;i<a;i++)
        {
            int count1 =0;
            int b = sc.nextInt();
            for(int j =1;j<=b;j++)
            {
                if(b%j==0)
                {
                    count1++;
                }
            }
            if(count1 == 2)
            {
                count2++;
            }
        }
        System.out.println(count2);
    }
}
