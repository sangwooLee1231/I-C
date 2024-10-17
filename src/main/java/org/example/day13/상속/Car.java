package org.example.day13.상속;

public class Car extends Vehicle {
    private int numDoors;
    public Car(String brand, String model, int numDoors ) {
        super(brand, model);
        this.numDoors = numDoors;
    }
        public int getnumDoors() {
            return numDoors;
        }
        @Override
        public String display() {
                return super.display() + ", numDoors: " + numDoors;
        }

    }

