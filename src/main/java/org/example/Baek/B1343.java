package org.example.Baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a, ".",true);
        List<String> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        String[] arr = list.toArray(new String[list.size()]);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>4)
            {


            }

        }


    }
}
