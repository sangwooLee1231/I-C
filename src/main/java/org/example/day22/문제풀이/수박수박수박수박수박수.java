package org.example.day22.문제풀이;

public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
        int a1 = 3;
        int a2 = 4;
        System.out.println(Solution.solution(a1));
        System.out.println(Solution.solution(a2));
    }
    class Solution {
        public static String solution(int n) {
            String answer = "";
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++){
                if(i%2==0){
                    sb.append("수");
                }
                else{
                    sb.append("박");
                }
            }
        answer = sb.toString();

            return answer;
        }
    }
}
