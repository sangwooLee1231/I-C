package org.example.day20.알고리즘;

public class Main2 {
    public static void main(String[] args) {

        int num = 40;
        int n = 2;

        Solution2 s = new Solution2();
        System.out.println(s.solution(num,n));

    }
}
class Solution2 {
    public int solution(int num, int n) {
        int answer = 0;

        if(num%n==0)
            answer =1;
        else
            answer = 0;

        return answer;
    }
}
