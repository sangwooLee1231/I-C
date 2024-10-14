package org.example.day10.생성자;

import javax.swing.*;
import java.awt.*;

public class Car사용2 {
    public static void main(String[] args) {


        Car2 c3 = new Car2();



        Car2 c1 = new Car2("테슬라","black",140);
        System.out.println(c1);
        // System.out.println(c1.model+" "+c1.color+" "+c1.maxSpeed);
        c1.speedUp();

        Car2 c2 = new Car2("GV80","회색",150);
      //  System.out.println(c2.model+" "+c2.color+" "+c2.maxSpeed);
        System.out.println((c2));
        c2.speedUp();
    }
}
