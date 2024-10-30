package org.example.day22.자료구조;

import java.util.Stack;
import java.util.TreeSet;

public class Q8 {
    public static void main(String[] args) {
        int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s5.length; i++) {
            stack.push(s5[i]);
            if(i==0||i==3||i==5)
            {
                sum = sum + s5[i];
            }
        }
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(sum);


    }
}
