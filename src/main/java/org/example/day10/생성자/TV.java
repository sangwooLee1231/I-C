package org.example.day10.생성자;

public class TV {
    //필드
    int channel;
    int volume;
    boolean onOff;

    //생성자
    public TV(int channel, int volume, boolean onOff) {
        this.channel = channel;
        this.volume = volume;
        this.onOff = onOff;
    }

    //멤버메서드

    //toString()
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", onOff=" + onOff +
                '}';
    }
}