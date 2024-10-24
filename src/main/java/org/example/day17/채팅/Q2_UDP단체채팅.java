package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Q2_UDP단체채팅 extends JFrame {
    private JTextArea messageArea;
    private JTextField inputField;
    private PrintWriter out;
    private BufferedReader in;
    private String nickname;

    public Q2_UDP단체채팅() {
        setTitle("채팅 클라이언트");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageArea = new JTextArea();
        messageArea.setEditable(false);
        add(new JScrollPane(messageArea), BorderLayout.CENTER);

        inputField = new JTextField();
        add(inputField, BorderLayout.SOUTH);

        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField.getText();
                if (!message.trim().isEmpty()) {
                    out.println(nickname + ": " + message);  // 닉네임과 함께 메시지 전송
                    inputField.setText("");
                }
            }
        });

        setVisible(true);
    }

    public void start(String serverAddress) {
        try {
            nickname = JOptionPane.showInputDialog(this, "닉네임을 입력하세요:", "닉네임 설정", JOptionPane.PLAIN_MESSAGE);

            if (nickname == null || nickname.trim().isEmpty()) {
                nickname = "익명";
            }

            Socket socket = new Socket(serverAddress, 7777);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String message = in.readLine();
                if (message != null) {
                    messageArea.append(message + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Q2_UDP단체채팅 client = new Q2_UDP단체채팅();
        client.start("192.168.60.58");
    }
}