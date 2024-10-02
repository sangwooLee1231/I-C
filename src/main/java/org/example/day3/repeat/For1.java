package org.example.day3.repeat;

import java.util.Random;

public class For1 {
    public static void main(String[] args) {
        Random r = new Random();

        for(int i=0; i<3; i++)
        {
            //3번 환영합니다. 출력

            System.out.println("환영합니다.");
        }
        System.out.println("================");

        for(int j=100;j<201;j++)
        {
            // 숫자를 100부터 200까지 출력
            System.out.println(j);
        }
        System.out.println("================");

        for(int k=0;k<5;k++)
        {
            //Random한 정수값 5개 출력(범위는 0~99)
            int num = r.nextInt(100);
            System.out.println(num);
        }

    }
}
