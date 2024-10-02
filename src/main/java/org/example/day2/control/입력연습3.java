package org.example.day2.control;

import java.util.Scanner;

public class 입력연습3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나의 이름은?");
        String a = sc.nextLine();
        System.out.print(("나의 키는?"));
        double b = sc.nextDouble();
        System.out.print(("나의 몸무게는?"));
        double c = sc.nextDouble();
        System.out.print("나는 저녁을 먹었나요?");
        boolean d = sc.nextBoolean();
        sc.nextLine();

        System.out.print("나의 좌우명은?");
        String e = sc.nextLine();
        System.out.println("----------------------");
        System.out.println("내 이름은"+a+"입니다.");
        System.out.println("내 내년 키는 "+b+"입니다.");
        System.out.println("내 내년 몸무게는 "+c+"입니다.");
        System.out.println("나는 저녁을 "+d+"했습니다.");
        System.out.println("나의 좌우명은"+e+"입니다.");




    }
}
