package org.example.Day5.Array2;

import java.util.Scanner;

public class 스트링을배열로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        int count = 0;
        r = r.trim();
        String[] str = r.split("-");
        if(str[0].equals("011"))
        {
            System.out.println("SK");
        }
        else if(str[0].equals("019"))
        {
            System.out.println("LG");
        }
        else
        {
            System.out.println("Apple");
        }
        if(str[1].length()>=4)
        {
            System.out.println("최신폰");
        }
        else
        {
            System.out.println("올드폰");
        }
        for(int i=0;i<str.length;i++)
        {
            count++;
        }


    }
}
