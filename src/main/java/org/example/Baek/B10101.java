package org.example.Baek;

import java.util.Scanner;

public class B10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        for(int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();  // 세 각도를 입력받음
        }

        // 삼각형의 세 각의 합이 180인지 확인
        if(arr1[0] + arr1[1] + arr1[2] == 180) {
            // 정삼각형인지 확인
            if(arr1[0] == arr1[1] && arr1[1] == arr1[2]) {
                System.out.println("Equilateral");
            }
            // 이등변삼각형인지 확인
            else if(arr1[0] == arr1[1] || arr1[1] == arr1[2] || arr1[0] == arr1[2]) {
                System.out.println("Isosceles");
            }
            // 부등변삼각형인지 확인
            else {
                System.out.println("Scalene");
            }
        }
        // 세 각의 합이 180이 아닌 경우
        else {
            System.out.println("Error");
        }
    }
}
