package org.example.day10.생성자;

public class Day {
    String work;
    int time;
    String place;
    static int cnt = 0;  // 모든 객체가 공유하는 변수

    // 생성자
    public Day(String work, int time, String place) {
        this.work = work;
        this.time = time;
        this.place = place;
        cnt += time;  // 새로운 객체가 생성될 때마다 시간을 더함
    }

    // 객체의 정보를 출력하는 toString 메소드
    public String toString() {
        return work + " " + time + " " + place;
    }
}
