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
        list.add(Integer.parseInt(list1));

        Collections.sort(list);
        Collections.reverse(list);


        System.out.println(list);


    }
}
