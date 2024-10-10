package org.example.day8.class사용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class 일기쓰기화면 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Font font = new Font("굴림", Font.BOLD, 40);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("일기 쓰기 창");
        frame.setSize(500, 600);

        JLabel date = new JLabel("오늘의 날짜");
        date.setFont(font);

        JLabel title = new JLabel("오늘의 제목");
        title.setFont(font);

        JLabel detail = new JLabel("오늘의 내용");
        detail.setFont(font);

        JButton save = new JButton("파일에 일기 저장");
        save.setFont(font);

        JTextField date1 = new JTextField(10);
        date1.setFont(font);
        JTextField title1 = new JTextField(10);
        title1.setFont(font);
        JTextArea detail1 = new JTextArea(3, 10);
        detail1.setFont(font);


        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);

        date1.setForeground(Color.BLUE);
        title1.setForeground(Color.BLUE);
        detail1.setForeground(Color.BLUE);
        save.setBackground(Color.PINK);
        frame.getContentPane().setBackground(Color.YELLOW);

        frame.add(date);
        frame.add(date1);
        frame.add(title);
        frame.add(title1);
        frame.add(detail);
        frame.add(detail1);
        frame.add(save);

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String date2 = date1.getText(); //get~~() <--> set~~()
                String title2 = title1.getText();
                String detail2 = detail1.getText();

                String message = "날짜: " + date2 + "\n제목: " + title2 + "\n내용:" + detail2;
                JOptionPane.showMessageDialog(frame, message);

                //파일도 만들어주고, 스트림으로 데이터를 저장까지 해주는 기능을 부품
                try {
                    FileWriter file = new FileWriter(date2 + ".txt");
                    file.write(date1+"");
                    file.write(title1+"");
                    file.write(detail1+"");
                    file.close();
                } catch (IOException ex) {
                    System.out.println("파일과 관련된 문제가 생김.");
                }
            }
        });

        frame.setVisible(true);
    }
}
