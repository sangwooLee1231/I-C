package org.example.day13.상속;

public class Vehicle {
    private String brand;
    private String model;


    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String display() {
        return "Brand: "+ brand + ", Model: " + model;
    }
}
