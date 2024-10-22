package org.example.day15.참조형형변환;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 신호등문제2 {
    static JFrame f;
    public static void main(String[] args) {
        f = new JFrame("나의 신호등");
        f.setSize(600,700);
        f.getContentPane().setBackground(Color.black);
        // JFrame에는 배경색 설정 기능이 없어 판을 만들어 색칠해주는 것
        Font font = new Font("궁서", Font.BOLD, 35);


        FlowLayout layout = new FlowLayout();
        JButton red = new JButton("빨강신호");
        JButton yellow = new JButton("노랑신호");
        JButton green = new JButton("초록신호");
        red.setBackground(Color.red);
        yellow.setBackground(Color.yellow);
        green.setBackground(Color.green);
        // FlowLayout 생성
        // 버튼 3개 만들어주세요.
        f.setLayout(layout);
        f.add(red);
        f.add(yellow);
        f.add(green);

        red.setFont(font);
        yellow.setFont(font);
        green.setFont(font);


        // 프레임에 버튼 3개 추가


        red.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
        });
        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        f.setVisible(true);

        //맨 끝!
    }

    public static void show() {
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon();
        label.setIcon(icon);
        f.add(label);
        f.setVisible(true);
    }
}
