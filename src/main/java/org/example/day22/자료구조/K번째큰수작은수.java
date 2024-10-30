package org.example.day22.자료구조;

import java.util.Collections;
import java.util.TreeSet;

public class K번째큰수작은수 {
    public static void main(String[] args) {
        int[] n = {1,12,3,6,18,9,10,10};
        TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<n.length;i++)
        {
            tree.add(n[i]);
        }
        System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());


        Object[] arr = tree.toArray();
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-2]);
        System.out.println(arr[arr.length-3]);
    }
}
