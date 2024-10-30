package org.example.day22.자료구조;

import java.util.Stack;

public class 올바른괄호문제 {
    public static void main(String[] args) {
       // String s = "()()";
        String s = "";

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(' ) {
                stack.push(s.charAt(i));
            }
            else{
                try {
                    stack.pop();
                }catch(Exception e) {
                    System.out.println(false);
                }
            }
        }



        if(stack.empty()) {
            System.out.println(true);
        }
        else
            System.out.println(false);
        }
    }

