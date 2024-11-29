package org.example.Baek;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


public class B1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        String[] arr2 = set.toArray(new String[set.size()]);

                Arrays.sort(arr2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
            if(o1.length() == o2.length())
                return o1.compareTo(o2);
            else
                return o1.length() - o2.length();
            }
        });
        for(String str : arr2) {
            System.out.println(str);
        }
    }
}