package org.example.day4.array;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 0;
        int choices;
        int scores[] = null;

        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.printf("선택> ");
            choices = sc.nextInt();

            if (choices == 1) {
                System.out.printf("학생수> ");
                students = sc.nextInt();
                scores = new int[students];
            } else if (choices == 2) {
                if (students == 0) {
                    System.out.println("먼저 학생수를 입력하세요.");
                } else {
                    for (int i = 0; i < students; i++) {
                        System.out.printf("scores[" + i + "]> ");
                        scores[i] = sc.nextInt();
                    }
                }
            } else if (choices == 3) {
                if (students == 0) {
                    System.out.println("먼저 학생수를 입력하세요.");
                } else {
                    for (int j = 0; j < students; j++) {
                        System.out.println("scores[" + j + "]: " + scores[j]);
                    }
                }
            } else if (choices == 4) {
                if (students == 0 || scores == null) {
                    System.out.println("먼저 학생수와 점수를 입력하세요.");
                } else {
                    int maxScore = scores[0];
                    int sum = 0;
                    for (int score : scores) {
                        if (score > maxScore) {
                            maxScore = score;
                        }
                        sum += score;
                    }
                    double average = (double) sum / students;
                    System.out.println("최고 점수: " + maxScore);
                    System.out.println("평균 점수: " + average);
                }
            } else if (choices == 5) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("올바른 번호를 선택하세요.");
            }
        }
        sc.close();
    }
}
