package org.example.day11.스태틱static;

public class 운동 {
    String work;
    String who;
    int time;
    private static int sum;
    static int count;


    public 운동(String work, String who, int time) {
        this.work = work;
        this.who = who;
        this.time = time;
        count++;
        sum = sum + time;
    }

    public String toString() {
        return " Work:" + work + " who:" + who + " people:" + time;
    }

    public static int getTime(){
        return sum;
    }


}
