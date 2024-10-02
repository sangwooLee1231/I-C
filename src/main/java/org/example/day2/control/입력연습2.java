package org.example.day2.control;

import java.util.Scanner;

public class 입력연습2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수를 입력하시오");
        int a = sc.nextInt();
        System.out.print("두번째 수를 입력하시오");
        int b = sc.nextInt();

        System.out.println(a>b?a:b);
        sc.close();
    }
}
