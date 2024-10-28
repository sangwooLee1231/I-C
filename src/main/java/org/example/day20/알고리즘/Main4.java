package org.example.day20.알고리즘;


public class Main4 {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.solution(180));
    }

}
    class Solution4 {
        public int solution(int angle) {
            int answer = 0;
            if(angle <90 && angle >0)
            {
                answer = 1;
            }
            else if(angle == 90)
            {
                answer = 2;
            }
            else if(angle > 90&& angle<180){
                answer = 3;
            }
            else if (angle == 180)
            {
                answer = 4;
            }

            if(angle>180)
                angle= angle-180;
            return answer;
        }
    }