package org.example.Day5.Array2;

import java.util.Scanner;

public class 인기투표 {
    public static void main(String[] args) {
        String[] name = {"아이유","유재석","BTS"};
        int[] tv = new int[3]; //{0,0,0}
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("인기투표 1)아이유 2)유재석 3)BTS 4)종료");
            int a = sc.nextInt();
            if(a == 1) {
                tv[0]++;
                cnt++;
                System.out.println("아이유가 한표 획득!");
            }
                else if(a == 2) {
                tv[1]++;
                cnt++;

                System.out.println("유재석이 한표 획득!");

            }
            else if(a == 3) {
                tv[2]++;
                cnt++;

                System.out.println("BTS가 한표 획득!");

            }
            else if(a == 4)
                break;
            else
                System.out.println("잘못된 접근입니다.");
        }
        for(int i=0;i<tv.length;i++)
        {
            System.out.println(name[i]+" : "+tv[i]);
        }
        System.out.println("전체 투표수:"+cnt);

        sc.close();
    }
}
