package org.example.day11.스태틱static;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 날짜확인문제 {
    public static void main(String[] args) {
        //LocalDateTime을 이용해서 현재 날짜를 구하세요.
        //종료일을 구하세요. 2주후 날짜를 구하세요.

        //종료일이 시작일보다 후이면, 아직 대여중입니다.
        //종료일이 시작일과 동일하면, 대여종료날입니다.

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("현재 시간: "+now.format(dtf));

        LocalDateTime result1 = now.plusDays(14);
        System.out.println("2주후 종료일: "+result1.format(dtf));



        if(result1.isAfter(now)) {
            System.out.println("아직 종료일 전입니다");
        }
        else if(result1.isEqual(now)) {
            System.out.println("대여종료날입니다.");
        }
    }
}
