package org.example.day10.생성자;

public class Day사용 {
    public static void main(String[] args) {
        Day day1 = new Day("자바공부", 10, "강남");
        Day day2 = new Day("여행", 15, "강원도");
        Day day3 = new Day("운동", 11, "피트니스");

        // 전체 시간의 합 출력
        System.out.println("총 시간: " + Day.cnt + "시간");
        System.out.println("평균 시간: "+Day.cnt/3 + "시간");
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
    }
}
