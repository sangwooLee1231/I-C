package org.example.day2.control;

import java.util.Scanner;

public class 기본4 {
    public static void main(String[] args) {

        double sum= 0;
        double g = 0;
        double total;
        double sale;

        Scanner sc = new Scanner(System.in);

        System.out.print("여행 지역을 입력하세요: ");
        String a = sc.nextLine();


        System.out.print("1인당 경비를 입력하세요: ");
        Double b = sc.nextDouble();

        System.out.print("여행 인원을 입력하세요: ");
        int c = sc.nextInt();

        System.out.print("할인율을 입력하세요: ");
        double d = sc.nextInt();

        System.out.print("VIP 여부 (true/false)를 입력하세요: ");
        boolean e = sc.nextBoolean();

        System.out.print("당부의 말을 입력하세요:");
        String f = sc.nextLine();

        sc.nextLine();

        if (e)
        {
            g=g+5;
            sum = g+d;

        }
        total = b*c;
        sale = total * (sum/100);


        System.out.println("===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역: "+a);
        System.out.printf("1인당 경비: %.1f원\n",b);
        System.out.println("여행 인원: "+c+"명");
        System.out.println("기본 할인율: "+d+"원");
        System.out.println("vip 추가 할인율: "+g+"%");
        System.out.println("최종 할인율: "+sum+"%");
        System.out.println("최종 금액: " +total+"원");
        System.out.println("할인 금액: " +sale+"원");
        System.out.println("할인 후 총 경비: " +(total-sale)+"원");
        System.out.println("당부의 말: " +f);



    }
}
