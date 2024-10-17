package org.example.day13.상속;

class Tablet extends Smartphone{ // 태블릿
    private int batteryCapacity; // 배터리 용량
    private String color; // 색상
    private boolean isConnected;
    // 연결 상태

    public Tablet(int batteryCapacity, String color, boolean isConnected) {
        this.batteryCapacity = batteryCapacity;
        this.color = color;
        this.isConnected = isConnected;
    }



    public boolean getIsConnected()
    { return isConnected; }

    public void setIsConnected(boolean status)
    { this.isConnected = status; }
}