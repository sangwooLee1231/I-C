package org.example.day2.control;

import javax.swing.*;

public class 순차문1 {
    public static void main(String[] args) {
        String id = "root";
        String pw = "1234";

        //입력하는 처리 필요
        String id2 = null; //널, 기본형 아닌 것.
        String pw2 = null;
        id2 = JOptionPane.showInputDialog("id입력"); //"admin", "root"
        pw2 = JOptionPane.showInputDialog("pw입력"); //"1111", "1234"

        System.out.println(id.equals(id2) && pw.equals(pw2));
    }
}