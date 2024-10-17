package org.example.day12.상속;

public class 원더우먼 extends 우먼 {

    int high; // 점프 높게!

    public 원더우먼(char gender, String name, int walk, int high) {
        super(gender, name, walk);
        this.high = high;
    }
}
