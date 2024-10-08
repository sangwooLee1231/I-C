package org.example.Baek;

import java.util.Scanner;

public class B3009 {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }


            if(arr1[0] == arr1[1])
            {
                arr1[3]=arr1[2];
            }
            else if(arr1[0] == arr1[2])
            {
                arr1[3]=arr1[1];
            }
            else
            {
                arr1[3]=arr1[0];
            }

            if(arr2[0] == arr2[1]) {
                arr2[3] = arr2[2];
            }
            else if(arr2[0]==arr2[2])
            {
                arr2[3]=arr2[1];

            }
            else
            {
                arr2[3]=arr2[0];
            }

        System.out.println(arr1[3]+" "+arr2[3]);



            }
}
