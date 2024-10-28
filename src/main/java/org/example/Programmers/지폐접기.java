package org.example.Programmers;

import java.util.Arrays;

public class 지폐접기 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] wallet = {50,50};
        int[] bill = {100,241};
        System.out.println(s.solution(wallet, bill));

    }
}

class Solution {
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        Arrays.sort(wallet);
        Arrays.sort(bill);

        while (!checkSize(wallet, bill)) {
            fold(wallet, bill);
            answer++;
        }
        return answer;
    }

    private static void fold(int[] wallet, int[] bill) {
        if (bill[0] > bill[1]) {
            bill[0] /= 2;
        } else {
            bill[1] /= 2;
        }
    }
    private static boolean checkSize(int[] wallet, int[] bill) {
        Arrays.sort(wallet);
        Arrays.sort(bill);

        return bill[0] <= wallet[0] && bill[1] <= wallet[1];
    }
}