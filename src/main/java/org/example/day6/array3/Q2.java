import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flowLayout = new FlowLayout();

        // Create a JPanel and set its background color
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setLayout(flowLayout);

        // Add the panel to the frame
        frame.add(panel);

        // Add components to the panel
        JLabel label = new JLabel("먹고 싶은 음식");
        panel.add(label);

        JTextField textField = new JTextField(10); // 입력하는 화면
        panel.add(textField);
        textField.setBackground(Color.gray);

        JButton button = new JButton("어디로 갈까?");
        panel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = textField.getText(); // 입력한 값 가지고 온다.
                if (data.equals("아메리카노")) {
                    JOptionPane.showMessageDialog(frame, "카페로 가세요.");
                } else {
                    JOptionPane.showMessageDialog(frame, "그러면 물을 마셔요");
                }
            }
        });

        JLabel label2 = new JLabel("당신의 나이는");
        panel.add(label2);

        JTextField textField2 = new JTextField(10);
        panel.add(textField2);
        textField2.setBackground(Color.gray);


        JButton button1 = new JButton("나의 내년 나이는?");
        panel.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data1 = textField2.getText(); // 입력한 값 가지고 온다.
                int a = Integer.parseInt(data1);
                JOptionPane.showMessageDialog(frame, "당신은 내년에 "+(a + 1)+"살이 됩니다.");
            }
        });

        JLabel label3 = new JLabel("국어 점수");
        panel.add(label3);

        JTextField textField3 = new JTextField(10);
        panel.add(textField3);
        textField3.setBackground(Color.gray);


        JLabel label4 = new JLabel("수학 점수");
        panel.add(label4);

        JTextField textField4 = new JTextField(10);
        panel.add(textField4);
        textField4.setBackground(Color.gray);



        JButton button2 = new JButton("두 과목 점수의 평균은?");
        panel.add(button2);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data2 = textField3.getText();
                String data3 = textField4.getText();
                double b = Double.parseDouble(data2);
                double c = Double.parseDouble(data3);

                JOptionPane.showMessageDialog(frame, "평균 점수는 "+(b+c)/2+"입니다.");

            }
        });

        // Set the frame to be visible
        frame.setVisible(true);
    }
}