package org.example.day10.정규표현식;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 우리 회사 직원 정보를 입력받아보자!!
        System.out.print("이름입력>>");
        String name = sc.next();
        if(Pattern.matches("^[가-힣]*", name))
        {
            System.out.println(name+"님 환영합니다");
        }
        else
        {
            System.out.println("다시 입력해야합니다.");
        }


        System.out.print("나이입력>>");
        String age = sc.next();
        if(Pattern.matches("^[0-9]*$",age))
        {
            int age1 = Integer.parseInt(age);
            System.out.println("만 나이 는+"+(age1-1));
        }
        else {
            System.out.println("숫자만 입력해야합니다.");

        }

        System.out.print("이메일(com)입력>>");
        String email = sc.next();
        if(Pattern.matches("\\w{5,8}+@new\\.com$", email))
        {
            System.out.println("이메일이 유효합니다.");
        }
        else
        {
            System.out.println("이메일이 유효하지 않습니다.");
        }

        sc.close();
    }
}
