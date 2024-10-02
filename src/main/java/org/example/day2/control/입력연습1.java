package org.example.day2.control;

import java.util.Scanner;

public class 입력연습1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 수동으로 import 해야할 때에는 Alt + Enter
        System.out.printf("이름 입력>> ");
        String name = sc.next(); // 한 단어만 입력, 홍길동
        System.out.printf("나이 입력>> ");
        int age = sc.nextInt(); // String --> int
        System.out.printf("몸무게 입력>> ");
        double w = sc.nextDouble(); // String --> double
        System.out.println(name + " "+ age + " "+ w);
        sc.close();
    }
}
