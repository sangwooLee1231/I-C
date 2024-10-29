package org.example.day21.알고리즘.선형;

public class Q3 {
    public static void main(String[] args) {
        String[] s3 = {"나는 ", "홍길동", "이다.",
                "너는 ", "김길동", "이다."
        };
//하나로 모아보세요.!
        String s4 = "";

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s3.length; i++) {
            sb2.append(s3[i]);
        }
        System.out.println(sb2);

    }
}
