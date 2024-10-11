package org.example.day9.문자파일;

import java.io.*;

public class 바이트를문자로 {
    /*글자를 써서, 파일에 저장하고 싶습니다.!
    FileWriter
    글자를 써서, 네트워크로 전송해야한다.!!
    네트워크 전송은 1바이트단위로 전송할 예정!
    글자를 써서 바이트배열로 변환 후
    --> 바이트배열을 바이트스트림으로 저장!

    */
    public static void main(String[] args) throws FileNotFoundException {
        try {
            OutputStream os = new FileOutputStream("C:\\first-repo\\a.txt");
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write("안녕!!!!!");
            writer.flush();
            writer.close();
            os.close();

    } catch (Exception e){
        e.printStackTrace(); //자세히 에러정보를 프린트!
        }
        //surround-with 코드 완성(Ctrl + Alt + T)
        // 파일 읽어오기(byte단위 전송됨.)
            try{
                InputStream is = new FileInputStream("C:\\first-repo\\a.txt");
                  Reader reader = new InputStreamReader(is);
                  char[] data = new char[100];
                  int num = reader.read(data);
                  String str = new String(data,0,num);
                System.out.println(str);
            }
     catch(Exception e){
                throw new RuntimeException(e);
            }

        }
}
