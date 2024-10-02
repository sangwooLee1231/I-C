package org.example.Baek;

import java.util.Scanner;

public class B2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2;
        int result = 0;
        for (int i = 1; i <=a; i++) {

            b = (b*2)-1;
        }
        result = b*b;
        System.out.println(result);
    }
}
