package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatClient {
    private static final String SERVER_ADDRESS = "192.168.60.58";
    private static final int SERVER_PORT = 7777;
    private static Socket socket;
    private static PrintWriter out;
    private static String nickname;
    private static Set<String> mutedUsers = new HashSet<>(); // 금지된 사용자 목록

    private static JTextArea textArea;
    private static JTextField inputField;

    public static void main(String[] args) {
        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            out = new PrintWriter(socket.getOutputStream(), true);

            // 닉네임 입력
            nickname = JOptionPane.showInputDialog("닉네임을 입력하세요:");
            out.println(nickname); // 서버에 닉네임 전송

            // GUI 설정
            JFrame frame = new JFrame("채팅방");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            textArea = new JTextArea();
            textArea.setEditable(false);
            inputField = new JTextField();
            inputField.setPreferredSize(new Dimension(500, 30));

            frame.getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);
            frame.getContentPane().add(inputField, BorderLayout.SOUTH);

            inputField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String message = inputField.getText();
                    inputField.setText("");

                    if (mutedUsers.contains(nickname)) {
                        JOptionPane.showMessageDialog(frame, "당신은 금지된 사용자입니다.");
                        return; // 금지된 사용자 메시지 전송 차단
                    }

                    // 메시지 전송
                    out.println(message);
                }
            });

            // 스레드 생성하여 서버로부터 메시지 수신
            new Thread(new IncomingMessageHandler()).start();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class IncomingMessageHandler implements Runnable {
        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message;
                while ((message = in.readLine()) != null) {
                    textArea.append(message + "\n");
                    textArea.setCaretPosition(textArea.getDocument().getLength());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}