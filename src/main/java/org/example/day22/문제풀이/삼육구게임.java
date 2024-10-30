package org.example.day22.문제풀이;

import java.util.Arrays;

public class 삼육구게임 {
    public static void main(String[] args) {
        int order = 3;
        int order1 = 29423;
        System.out.println(Solution.solution(order));
        System.out.println(Solution.solution(order1));


    }
    class Solution {
        public static int solution(int order) {
            int answer = 0;
            char[] arr = String.valueOf(order).toCharArray();
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]=='3'||arr[i]=='6'||arr[i]=='9')
                {
                    answer++;
                }
            }

            return answer;
        }
    }
}
