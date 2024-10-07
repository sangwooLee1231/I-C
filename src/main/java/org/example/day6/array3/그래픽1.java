package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 그래픽1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("그래픽 연습");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //3
        //x를 누르면 프로그램 종료시킬 예정

        JButton button = new JButton();
        button.setText("나를 눌러!");
        button.setSize(100, 100);


        JButton button2 = new JButton();
        button2.setText("@@@@@@@@@@@");

        JButton button3 = new JButton();
        button3.setText("<<!");
        button3.setSize(100, 100);

        JButton button4 = new JButton();
        button4.setText(">>!");
        button4.setSize(100, 100);

        // JFrame은 위, 아래, 좌, 우, 중앙중 선택해서 넣을 것으로 기본설정 되어있음
        // 위치를 정하지 않으면 가운데로 계속 덮어쓴다.

        frame.add(button, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.CENTER);
        frame.add(button3, BorderLayout.SOUTH);
        frame.add(button4, BorderLayout.EAST);


        // 맨 끝!
        frame.setVisible(true);
    }
}
