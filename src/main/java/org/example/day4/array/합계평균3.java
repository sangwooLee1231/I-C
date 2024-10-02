package org.example.day4.array;

import java.util.Scanner;

public class 합계평균3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] trip = {"열차","배","비행기"};
        String[] mount = {"백두산","한라산","후지산"};
        System.out.print("가고 싶은 곳) 보기, 1)백두산 2한라산 3)후지산 입력>>");
        int a = sc.nextInt();
        a--;

        System.out.println("당신이 가고 싶은 곳인 "+mount[a]+"은 "+trip[a]+"를 타고 가야 합니다");


    }
}
