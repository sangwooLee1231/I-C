package org.example.day22.자료구조;

import java.util.TreeSet;

public class Q4 {
    public static void main(String[] args) {
        int[] s4 = {11,3,78,9,2,100};
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<s4.length;i++)
        {
            set.add(s4[i]);
        }
        Object[] arr = set.toArray();
        System.out.println(arr[arr.length-2]);
        System.out.println(arr[1]);
    }

}
