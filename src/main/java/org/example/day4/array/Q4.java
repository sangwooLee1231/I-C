package org.example.day4.array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr1 = {0,0,0,0,0,0,0,0,0,0};
        int count=0;

            while(true) {
            System.out.println("현재 좌석 상태:");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print((i+1)+":"+arr1[i]+" ");
            }
            System.out.println("예매할 좌석 번호를 입력하세요 (종료하려면 0 입력):");
                int a = sc.nextInt();

                if(a==0)
                {
                    break;
                }
                if(arr1[a-1] == 1)
                {
                    System.out.println("이미 예매된 좌석입니다.");
                }
                else
                {
                    System.out.println(a+"번 좌석이 예매되었습니다.");
                    count++;
                }
            arr1[a-1] = 1;




            }
        System.out.println("예매된 총 좌석수 : "+count);
        System.out.println("총 예매 금액 : "+count*10000+"원");
    }
}
