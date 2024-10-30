package org.example.day22.문제풀이;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열정렬하기2 {
    public static void main(String[] args) {
        String my_string1 = "hi12392";
        String my_string2 = "p2o4i8gj2";
        String my_string3 = "abcde0";

        System.out.println(Arrays.toString(Solution.solution(my_string1))); // 정렬된 숫자 출력
        System.out.println(Arrays.toString(Solution.solution(my_string2))); // 정렬된 숫자 출력
        System.out.println(Arrays.toString(Solution.solution(my_string3))); // 정렬된 숫자 출력
    }

    static class Solution {
        public static int[] solution(String my_string) {
            ArrayList<Integer> digitList = new ArrayList<>();

            char[] arr = my_string.toCharArray();
            for (char c : arr) {
                if (Character.isDigit(c)) {
                    digitList.add(Character.getNumericValue(c));
                }
            }

            int[] answer = new int[digitList.size()];
            for (int i = 0; i < digitList.size(); i++) {
                answer[i] = digitList.get(i);
            }

            Arrays.sort(answer);
            return answer; // 정수 배열 반환
        }
    }
}
