package org.example.day2.review;

import javax.swing.*;

public class test3 {
    public static void main(String[] args) {
        String id = "root";
        String pw = "1234";


        // 입력하는 시간 필요
        String id2 = null; //널, 기본형 아닌것
        String pw2 = null;
        id2 = JOptionPane.showInputDialog("id입력");
        id2 = JOptionPane.showInputDialog("pw입력");

        System.out.println(id.equals("root") && pw.equals("1234"));
    }
}
