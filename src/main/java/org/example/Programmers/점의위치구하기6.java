package org.example.Programmers;

public class 점의위치구하기6 {
    public static void main(String[] args) {
        int answer = 0;
        int[] numbers = {2, 4};
        int x = numbers[0];
        int y = numbers[1];
        if (x > 0 && y > 0) {
            answer = 1;
        } else if (x < 0 && y > 0) {
            answer = 2;
        } else if (x < 0 && y < 0) {
            answer = 3;
        } else if (x > 0 && y < 0) {
            answer = 4;
        }
        System.out.println(answer);
    }
}
