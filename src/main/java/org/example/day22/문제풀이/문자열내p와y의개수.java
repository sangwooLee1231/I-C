package org.example.day22.문제풀이;


public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        String s ="pPoooyY";
        String s1 = "Pyy";
        System.out.println(Solution.solution(s));
        System.out.println(Solution.solution(s1));

    }
    class Solution {
        static boolean solution(String s) {
            boolean answer = false;
            int count1 = 0;
            int count2 = 0;

           s = s.toUpperCase();
            char[] arr = s.toCharArray();
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]=='P'){
                    count1++;
                }
                else if(arr[i]=='Y'){
                    count2++;
                }
            }
            if(count1==count2){
                answer = true;
            }
            return answer;
        }

    }

}





