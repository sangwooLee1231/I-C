package org.example.day3.array;


import java.util.Arrays;

public class array3 {
    public static void main(String[] args) {
        int a[] = new int[3];
        // 주소가 들어가 있음 a변수(참조변수)
        System.out.println(a);
        a[0] = 100;
        a[1] = 200;
        a[a.length-1] = 300;

        System.out.println(Arrays.toString(a));



    }

}
