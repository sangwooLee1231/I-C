package org.example.day22.자료구조;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
        int[] s6 = new int[s5.length];
        int count = 0;
        for (int i = s5.length-1; i >=0; i--) {
            s6[i] = s5[count];
            count++;
        }
        System.out.println(Arrays.toString(s6));
    }

}
