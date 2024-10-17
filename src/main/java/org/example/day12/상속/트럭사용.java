package org.example.day12.상속;

public class 트럭사용 {
    public static void main(String[] args) {


        Truck t = new Truck();
        t.color = "핑크";
        t.speed = 100;
        t.weight = 1;
        System.out.println(t);
        t.move();
        t.start();
        t.stop();
    }
}
