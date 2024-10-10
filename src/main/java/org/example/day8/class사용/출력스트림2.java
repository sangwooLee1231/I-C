package org.example.day8.class사용;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class 출력스트림2 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("c:/data/imsi.txt");
            byte[] array = {10,20,30};

            os.write(array);
            os.flush();
            os.close();
        }catch (Exception e) {
            e.printStackTrace();

        }
    }
}
