package org.example.day2.control;

import java.util.Scanner;

public class 심화2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        int count=0;
        int a_win=0;
        int b_win=0;


        while(true)
        {
            System.out.println("게임을 계속 하시겠습니까? 계속 or 종료");
            a = sc.nextLine();

            if(a.equals("종료"))
                break;


            System.out.println("첫 번째 사람이 숫자를 입력하세요:");
            int b = sc.nextInt();

            System.out.println("두 번째 사람이 숫자를 입력하세요");
            int c = sc.nextInt();

            if (b>c)
            { a_win++;
                System.out.println("첫 번째 사람이 이겼습니다!");

            }
            else if (b==c)
            {
                System.out.println("비겼습니다.");
            }
            else {
                b_win++;
                System.out.println("두 번째 사람이 이겼습니다");
            }
            sc.nextLine();
        count++;
        }
        System.out.println("총 게임수: "+count);
        System.out.println("첫 번째 사람이 이긴 횟수: "+a_win);
        System.out.println("두 번째 사람이 이긴 횟수: "+b_win);
    }


}
