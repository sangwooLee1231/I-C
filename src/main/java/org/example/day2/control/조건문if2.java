package org.example.day2.control;

import java.util.Scanner;

public class 조건문if2 {
    public static void main(String[] args) {

        int hour = 16;

        while(true) {
            if (hour < 11) {
                System.out.println("멀음");
            } else if (hour < 14) {
                System.out.println("조금 남음");
            } else if (hour < 17) {
                System.out.println("거의 끝남");
            } else {
                System.out.println("끗");
                break;
            }
        }
    }

}
