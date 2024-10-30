package org.example.day22.자료구조;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        Stack<Integer> S = new Stack<>();
        S.push(arr[0]);
        for(int i=1;i<arr.length;i++) {
            if(S.peek()!=arr[i]) {
                S.push(arr[i]);
            }

        } int[] answer = new int[S.size()];
        for(int i=0;i<S.size();i++) {
            answer[i] = S.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
