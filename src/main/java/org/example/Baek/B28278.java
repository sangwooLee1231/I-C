package org.example.Baek;

import java.io.*;
import java.util.Scanner;

public class B28278 {
    private static int[] stack;
    private static int Size = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int b = Integer.parseInt(br.readLine());
        stack = new int[b];  // 스택 배열 초기화 (명령어 수만큼의 크기)

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b; i++) {
            int a = Integer.parseInt(br.readLine());  // 명령어 입력
            if (a == 1) {
                int c = Integer.parseInt(br.readLine());
                push(c);
            } else if (a == 2) {
                sb.append(pop()).append("\n");
            } else if (a == 3) {
                sb.append(Size()).append("\n");
            } else if (a == 4) {
                sb.append(Empty()).append("\n");
            } else if (a == 5) {
                top();
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void push(int a) {
        stack[Size] = a;
        Size++;
    }

    public static int pop() {
        if (Size == 0) {
            return -1;  // 스택이 비어있으면 -1 반환
        } else {
            int result = stack[Size - 1];  // 스택의 가장 위에 있는 값 반환
            Size--;
            return result;
        }
    }

    public static int Size() {
        return Size;
    }

    public static int Empty() {
        return Size == 0 ? 1 : 0;  // 스택이 비어있으면 1, 아니면 0 반환
    }

    public static void top() {
        if (Size == 0) {
            System.out.println(-1);  // 스택이 비어있으면 -1 출력
        } else {
            System.out.println(stack[Size - 1]);  // 가장 위에 있는 값 출력
        }
    }
}
