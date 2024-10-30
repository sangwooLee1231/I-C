package org.example.day22.자료구조;

import java.util.Stack;

public class 스택내부함수사용 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(-1);
        }
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(-1);
        }
        stack.push("3");
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }
}
