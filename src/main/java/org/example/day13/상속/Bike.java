package org.example.day13.상속;

public class Bike extends Vehicle {
    private boolean hasCarrier;
    public Bike(String brand, String model, boolean hasCarrier) {
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }
    public boolean hasCarrier() {
        return hasCarrier;
    }
    @Override
    public String display() {
        return super.display() + " hasCarrier: " + hasCarrier;
    }
}
