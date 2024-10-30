package org.example.day22.자료구조;

import java.util.LinkedHashSet;
import java.util.Set;

public class Q7 {
    public static void main(String[] args) {
        int s7 = 234534567;
        int[] s6 = new int[10];
        int sum = 0;

        Set<Character> uniqueDigits = new LinkedHashSet<>();
        for (char digit : Integer.toString(s7).toCharArray()) {
            uniqueDigits.add(digit);
        }
        s6 = uniqueDigits.stream().mapToInt(d -> d).map(a->a=a-48).toArray();
        for(int i=0;i<s6.length;i++)
        {
            System.out.println(s6[i]);
            sum = sum + s6[i];

        }
        System.out.println(sum);

    }
}
