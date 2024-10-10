package org.example.Baek;

import java.util.Scanner;

public class B10828 {
    private static int[] stack;
    private static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();  // 명령어의 개수 입력
        stack = new int[b];  // 스택 배열 초기화

        for (int i = 0; i < b; i++) {
            String command = sc.next();  // 명령어 입력

            if (command.equals("push")) {
                int value = sc.nextInt();  // 'push' 뒤에 오는 값 입력
                push(value);
            } else if (command.equals("pop")) {
                System.out.println(pop());  // pop 결과 출력
            } else if (command.equals("top")) {
                System.out.println(top());  // top 결과 출력
            } else if (command.equals("size")) {
                System.out.println(size());  // size 결과 출력
            } else if (command.equals("empty")) {
                System.out.println(empty());  // empty 결과 출력
            }
        }
    }

    // push: 스택에 값을 넣는 함수
    public static void push(int a) {
        stack[size] = a;
        size++;
    }

    // pop: 스택에서 값을 빼고 반환하는 함수
    public static int pop() {
        if (size == 0) {
            return -1;  // 스택이 비어있으면 -1 반환
        } else {
            int result = stack[size - 1];  // 가장 위의 값
            size--;  // 스택 크기 감소
            return result;  // 값 반환
        }
    }

    // size: 스택에 있는 값의 개수 반환
    public static int size() {
        return size;
    }

    // empty: 스택이 비어있는지 확인하는 함수
    public static int empty() {
        return size == 0 ? 1 : 0;  // 비어있으면 1, 아니면 0 반환
    }

    // top: 스택의 가장 위에 있는 값을 반환하는 함수
    public static int top() {
        if (size == 0) {
            return -1;  // 스택이 비어있으면 -1 반환
        } else {
            return stack[size - 1];  // 스택의 가장 위에 있는 값 반환
        }
    }
}
