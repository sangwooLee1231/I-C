package org.example.day22.자료구조;

import java.util.*;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(Solution.solution(s));
    }

    static class Solution {
        public static String solution(String s) {
            String answer = "";

            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (char c : s.toCharArray()) {
                if (map.get(c) == 1) {
                    answer += c;
                }
            }
            char[] c = answer.toCharArray();
            Arrays.sort(c);

            answer = String.valueOf(c);



            return answer;
        }
    }
}


