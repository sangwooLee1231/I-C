package org.example.day16.네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class 신세계클라이언트들 {
    public static void main(String[] args) throws IOException {
        // ip + port!
        for (int i=0;i<1000;i++) {
            Socket client = new Socket("localhost", 5000);
            System.out.println(i + " >> 클라이언트가 접속함");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            // buffer : 임시 저장 장치
            String data = buffer.readLine();
            System.out.println("서버로 부터 받은 데이터 > "+data);
        }
    }
}

