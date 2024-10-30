package org.example.day22.문제풀이;

public class 대문자와소문자 {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        String my_string1 = "abCdEfghIJ";
        System.out.println(Solution.solution(my_string));
        System.out.println(Solution.solution(my_string1));

    }
    class Solution {
        public static String solution(String my_string) {
            String answer = "";
        char[] arr = String.valueOf(my_string).toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>='a' && arr[i]<='z') {
                arr[i] = (char)(arr[i] - 'a' + 'A');
            }
            else if(arr[i]>='A' && arr[i]<='Z') {
                arr[i] = (char)(arr[i] - 'A' + 'a');
            }
        }

        answer = new String(arr);


            return answer;
        }
    }
}
