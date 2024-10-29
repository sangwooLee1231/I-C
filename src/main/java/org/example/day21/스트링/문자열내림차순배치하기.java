package org.example.day21.스트링;

import java.util.Arrays;


public class 문자열내림차순배치하기 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        // 대 --> 소
        //소문자는 z~~a
        //소문자앞 + 대문자뒤
        //오름차순으로 정렬 후 reversed로 뒤집기
        char[] array = s.toCharArray();
        Arrays.sort(array); // 오름차순으로 정렬!
        // 1. 컬렉션으로 만들어서 뒤집어도 되고
        // 2. sb로 넣어서 뒤집어도 됨.
        StringBuilder sb = new StringBuilder(new String(array));
        String result = sb.reverse().toString();
        System.out.println(result);
    }
}