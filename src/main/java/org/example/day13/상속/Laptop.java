package org.example.day13.상속;

class Laptop { // 노트북
    private int batteryCapacity; // 배터리 용량
    private String color; // 색상
    public int getBatteryCapacity()
    { return batteryCapacity; }

    public void setBatteryCapacity(int capacity)
    { this.batteryCapacity = capacity; }

    public String getColor()
    {return color; }

    public void setColor(String color)
    { this.color = color; }

    public void charge(int additionalCapacity)
    { this.batteryCapacity += additionalCapacity; }
}