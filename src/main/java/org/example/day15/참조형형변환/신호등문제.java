package org.example.day15.참조형형변환;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 신호등문제 {
    public static void main(String[] args) {
        JFrame f = new JFrame("나의 신호등");
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
                    // 이미지 만들어서 라벨에 껴서 프레임에 add해주자.!
                    JLabel label = new JLabel();
                    ImageIcon icon = new ImageIcon("r.png");
                    label.setIcon(icon);
                    f.add(label);
                    f.setVisible(true);

                }
        });
        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 이미지 만들어서 라벨에 껴서 프레임에 add해주자.!
                JLabel label = new JLabel();
                ImageIcon icon = new ImageIcon("y.png");
                label.setIcon(icon);
                f.add(label);
                f.setVisible(true);

            }
        });
        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 이미지 만들어서 라벨에 껴서 프레임에 add해주자.!
                JLabel label = new JLabel();
                ImageIcon icon = new ImageIcon("g.png");
                label.setIcon(icon);
                f.add(label);
                f.setVisible(true);


            }
        });

        f.setVisible(true);

        //맨 끝!


    }
}
