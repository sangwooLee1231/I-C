package org.example.day8.class사용;

import org.example.day8.class만들기.일기장;

public class 일기를매일 {
    public static void main(String[] args) {
        일기장 day1 = new 일기장();
        day1.title = "목요일이닷!";
        day1.content = "와~ 금요일이닷!";
        day1.weather = "흐림";

        day1.일기쓰다();
        System.out.println(day1.title + " "+ day1.content + " " + day1.weather);

    }
}
