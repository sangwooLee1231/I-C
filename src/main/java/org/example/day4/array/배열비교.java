package org.example.day4.array;

public class 배열비교 {
    public static void main(String[] args) {
        String[] title = {"국어", "수학", "영어", "컴퓨터", "음악"};
        int[] n1 = {44, 66, 77, 22, 11};
        int[] n2 = {33, 55, 77, 22, 40};
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        //1. 1학기, 2학기 동일한 점수인 과목 수, 동일하지 않은 점수인 과목수
        for (int i = 0; i < title.length; i++) {
            if (n1[i] == n2[i]) {
                c1++;
            } else {
                c2++;
            }
        }
        System.out.println(c1 + " " + c2);
        System.out.println("=================================");

        //2. 2학기에 성적이 오른 과목수

        for (int i = 0; i < title.length; i++) {
            if (n1[i] < n2[i]) {
                c3++;
            }
        }
            System.out.println(c3);
            System.out.println("=================================");
            // 3. 2학기에 성적이 오른 과목명

            for (int j = 0; j < title.length; j++) {
                if (n1[j] < n2[j]) {
                    System.out.println(title[j]);
                }
            }

        }
    }
