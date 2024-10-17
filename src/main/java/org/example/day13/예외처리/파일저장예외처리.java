package org.example.day13.예외처리;

import java.io.FileWriter;
import java.util.Scanner;

public class 파일저장예외처리 {
    public static void main(String[] args) {
        FileWriter r1 = null;
        Scanner sc = new Scanner(System.in);

        try {
            r1 = new FileWriter("C:\\test.txt");
        } catch (Exception e) {

        }
    }
}
