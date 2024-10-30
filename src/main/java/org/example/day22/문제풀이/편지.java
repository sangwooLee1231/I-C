package org.example.day22.문제풀이;

public class 편지 {
    public static void main(String[] args) {
        String message = "happy birthday!";
        String message1 = "I love you~";
        System.out.println(Solution.solution(message));
        System.out.println(Solution.solution(message1));


    }
    class Solution {
        public static int solution(String message) {
            int answer = 1;
            answer = answer * (message.length() * 2);

            return answer;
        }
    }
}
