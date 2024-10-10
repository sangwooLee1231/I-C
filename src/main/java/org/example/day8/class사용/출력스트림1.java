package org.example.day8.class사용;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class 출력스트림1 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("c:/data/imsi.txt");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();
        }catch (Exception e) {
            e.printStackTrace();

        }
    }
}
