package org.example.day20.알고리즘;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println(s.solution(arr, n));

    }
        }
class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]==n){
                answer++;
            }
        }
        return answer;
    }
}
