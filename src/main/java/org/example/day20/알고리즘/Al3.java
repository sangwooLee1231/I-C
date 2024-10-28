package org.example.day20.알고리즘;

public class Al3 {
    public static void main(String[] args) {

        int a = 10;
        int b= 5;
        Solution3 s = new Solution3();
        System.out.println(s.solution(a,b));


    }
}
class Solution3 {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;

        return answer;
    }
}
