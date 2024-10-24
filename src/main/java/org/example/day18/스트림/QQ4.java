package org.example.day18.스트림;

import java.util.Arrays;
import java.util.Random;

public class QQ4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[500];
        Arrays.stream(arr).map(a->a = r.nextInt(401)-200).filter(a->a>=0).map(a->a=a*a)
    }
}
