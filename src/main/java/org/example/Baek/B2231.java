package org.example.Baek;

import java.util.Scanner;

public class B2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String a = Integer.toString(n);
      String[] b = a.split("");
      int[] c = new int[5];
      for(int i = 0; i < b.length; i++)
      {
        c[i] =  Integer.parseInt(b[i]);
      }
        System.out.println(c[0]+" "+c[1]+" "+c[2]+" "+a);
    for(int i=0;i<n;i++)
    {

    }

    }
}
