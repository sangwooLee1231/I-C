package org.example.day11.스태틱static;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] n = {3,5,7,9,1};
        // 정렬오름차순!
        Arrays.sort(n); //파괴형메서드
        System.out.println(Arrays.toString(n));
        System.out.println(n);

        Random random = new Random();
        System.out.println(random.nextDouble());

        for(int i=0;i<5;i++) {
            double n2 = Math.random();
            System.out.println(Math.random()); //double
            //0~0.9999
            System.out.println((int)(n2 * 10)+1);


            Calendar cal = Calendar.getInstance();
            System.out.println(cal);
            System.out.println(Calendar.YEAR);
            System.out.println(cal.get(Calendar.YEAR));
            System.out.println(cal.get(Calendar.MONTH)+1);
            System.out.println(cal.get(Calendar.DATE));
            System.out.println(cal.get(Calendar.MINUTE));
            System.out.println(cal.get(Calendar.SECOND));


            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println("현재 시간: "+now.format(dtf));

            LocalDateTime result1 = now.plusYears(1);
            System.out.println("1년 덧셈: "+result1.format(dtf));

            LocalDateTime result2 = now.minusMonths(2);
            System.out.println("2년 뺄셈: "+result2.format(dtf));

            LocalDateTime result3 = now.plusDays(7);
            System.out.println("7일 덧셈: "+result3.format(dtf));

            LocalDateTime result4 = LocalDateTime.of(2000,1,1,0,0,0);
            System.out.println(dtf.format(result4));
            System.out.println(result4.plusYears(18));

        }
    }
}
