package org.example.day22.자료구조;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        String sno = "2056521";
        char[] arr = sno.toCharArray();
        int sum = 0;
        int count=0;
        if(arr[arr.length-1]=='1')
        {
            System.out.println("서대문구에서 출생");
        }
        else
        {
            System.out.println("다른 구에서 출생");
        }
        String s1 = (arr[4]) + String.valueOf(arr[5]);
        char[] result = s1.toCharArray();
        int[] arr2 = new int[result.length];
        for(int i=0;i<result.length;i++)
        {
            arr2[i] = Integer.parseInt(String.valueOf(result[i]));
        }
        for(int i=0;i<arr2.length;i++)
        {
            sum = sum + arr2[i];
        }
        if(sum>10)
        {
            System.out.println("유효한 주민번호가 아닙니다.");
        }
        else
        {
            System.out.println("유효한 주민번호입니다.");
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='5')
            {
                count++;
            }
        }
        System.out.println(count);





    }
}
