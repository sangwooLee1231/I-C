package org.example.day22.문제풀이;

import java.util.Arrays;

public class 문자열정렬하기 {
    public static void main(String[] args) {
        String my_string1 = "Bcad";
        String my_string2 = "heLLo";
        String my_string3 = "Python";
        System.out.println(Solution.solution(my_string1));
        System.out.println(Solution.solution(my_string2));
        System.out.println(Solution.solution(my_string3));

    }
    class Solution {
        public static String solution(String my_string) {
            my_string = my_string.toLowerCase();
            String answer = "";
            char[] arr = String.valueOf(my_string).toCharArray();
            Arrays.sort(arr);
            for(int i = 0; i < arr.length; i++) {
                answer = answer + arr[i];
            }
            return answer;
        }
    }
}
