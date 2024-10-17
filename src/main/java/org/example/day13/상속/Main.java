package org.example.day13.상속;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota","Camry",4);
        Bike bike = new Bike("Yamaha","MT-15",true);

        System.out.println(car.display());
        System.out.println(bike.display());


    }
}
