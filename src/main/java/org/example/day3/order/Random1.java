package org.example.day3.order;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random(100);  // 난수 발생 클래스
       // r.setSeed(100); //의사 임시값

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(100);
            int num2 = r.nextInt(100)+1;// ==> 범위를 음수나 양수로 따로 지정하고 싶다면 뒤에 값을 추가
            System.out.println(num);
            System.out.println(num2);

        }
    }
}
