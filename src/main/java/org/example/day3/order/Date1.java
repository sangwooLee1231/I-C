package org.example.day3.order;

import java.util.Date;
import java.util.Scanner;

public class Date1 {
    public static void main(String[] args) {
        //입력할 때 자동으로 년/월/일, 시/분/초로 구분하고 싶을 때

        Date date = new Date();
        int year = date.getYear(); // int
        int month = date.getMonth();
        int date1 = date.getDate();
        int day = date.getDay();
        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();


        System.out.println(year + " " + month + " " + date1 + " " + day + " " + hour + " " + minute + " " + second);

        // 오늘 무슨 요일 인가요? 프린트
        switch(day)
        {
            case 1:
            {
                System.out.println("월요일");
                break;
            }
            case 2:
            {
                System.out.println("화요일");
                break;
            }
            case 3:
            {
                System.out.println("수요일");
                break;

            }
            case 4:
            {
                System.out.println("목요일");
                break;

            }
            case 5:
            {
                System.out.println("금요일");
                break;

            }
            case 6:
            {
                System.out.println("토요일");
                break;

            }
            case 7:
            {
                System.out.println("월요일");
                break;

            }

        }

    }
}
