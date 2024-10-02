package org.example.day3.repeat;

import java.util.Date;


public class While1 {
    public static void main(String[] args)
    {
        // 유한반복 ==> 시작점, 조건, 증가
        int i = 1; //시작값
        int add = 1;  //증감값
        while (i <= 10) { // 조건
            System.out.println(i);
            i++; // 증가처리
        }   // While

        System.out.println("============");
        for(int j=0;j<10;j++)
        {
            System.out.println(j+1);
        } // for
        System.out.println("==============");

        while(true) // ==> boolean(논리형 데이터)
        {
            System.out.println("내가 계속 돌아.");
            Date date = new Date();
            int seconds = date.getSeconds();
            if (seconds > 50){
                break;
            }
        }

    }   // main

}   // Class
