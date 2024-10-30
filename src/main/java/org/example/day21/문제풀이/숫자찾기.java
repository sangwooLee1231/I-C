package org.example.day21.문제풀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class 숫자찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int count = 0;
        char k = br.readLine().charAt(0);
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length-1;i++){

            if(Objects.equals(arr[i], k))
            {
                System.out.println(count);
                break;
            }
            count++;
        }
        count++;
        if(count == arr.length)
        {
            System.out.println("없음");
        }
    }
}
