package org.example.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class 배열최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] save = new int[5];
        for(int i=0;i<save.length; i++)
        {
            System.out.println("숫자 입력>>");
            save[i] = sc.nextInt(); // 모든 입력은 String ---> int를 변경하는 기능으로 포함
        }
        System.out.println(Arrays.toString(save));

        sc.close(); // stream 닫힘. 맨 끝에 위치

        Arrays.sort(save); // 오름차순 정렬, 맨앞 최솟값, 맨끝 최댓값
        System.out.println("최솟값 : "+save[0]);
        System.out.println("최대값 : "+save[save.length-1]);

        int max = save[0];
        for(int i=1;i<save.length;i++)
        {
            if (max<save[i])
            {
                    max = save[i];
            }
        }
        System.out.println(max);
    }
}
