package org.example.day9.문자파일;
import java.io.*;

public class 버퍼사용성능개선 {
    public static void main(String[] args) {
        //파일 읽어오기(byte단위 전송됨.)
        //surround-with 코드 완성(컨트롤+알트+T)
        try {
            InputStream is = new FileInputStream("c:/first-repo/a.txt");
            Reader reader = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(reader);
            //BufferedReader bf = new BufferedReader(new BufferedReader(new FileInput
            while(true) {
                String line = bf.readLine();
                if(line == null) break;
                System.out.println(line);
            }
            is.close();
            reader.close();
            bf.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

