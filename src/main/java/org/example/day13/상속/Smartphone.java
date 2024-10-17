package org.example.day13.상속;

public class Smartphone {
    private int batteryCapacity; // 배터리 용량
    private String color; // 색상
    private int cameraResolution; // 카메라 해상도
    public int getBatteryCapacity()
    { return batteryCapacity; }

    public void setBatteryCapacity(int capacity)
    { this.batteryCapacity = capacity; }

    public String getColor()
    { return color; }

    public void setColor(String color)
    { this.color = color; }

    public int getCameraResolution()
    { return cameraResolution; }

    public void setCameraResolution(int resolution)
    { this.cameraResolution = resolution; }


}
