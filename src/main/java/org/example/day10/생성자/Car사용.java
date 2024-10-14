package org.example.day10.생성자;

public class Car사용 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "테슬라";
        c1.color = "black";
        c1.maxSpeed = 140;


        System.out.println(c1.model+" "+c1.color+" "+c1.maxSpeed);
        c1.speedUp();

        Car c2 = new Car();
        c2.model = "GV80";
        c2.color = "회색";
        c2.maxSpeed = 150;


        System.out.println(c2.model+" "+c2.color+" "+c2.maxSpeed);
        c2.speedUp();
    }
}
