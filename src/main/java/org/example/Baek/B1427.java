package org.example.Baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B1427 {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String list1 = br.readLine();
        char[] arr = list1.toCharArray();
        for(int i=0;i<arr.length;i++) {
            list.add(Integer.parseInt(String.valueOf(arr[i])));
        }


        Collections.sort(list);
        Collections.reverse(list);


        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i));
        }


    }
}
