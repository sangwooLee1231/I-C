package org.example.Baek;

import java.util.Scanner;

public class B1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int count=0;
        int count1 = 0;
        for(int i = 0; i < b; i++) {
            String a = sc.next(); // 입력 문자열
            char[] arr = a.toCharArray();  // 문자열을 char 배열로 변환
            for(int j=0;j<arr.length;j++) {
                if((int)arr[j]>=(int)arr[j+1]) {
                    count=3;
                }
            }
            if(count==0) {
                count1++;
            }
        }
        System.out.println(count1);
    }
}
