package org.example.day5.array2;

public class 스트링확인 {
    public static void main(String[] args) {
        String tel = "    011-245-1234";
        //1.공백제거
        tel = tel.trim();
        System.out.println(tel);
        //2.
        String[] tel2 = tel.split("-");

        //3. if문이나 switch문
        //   if문 사용하는 경우, equals()사용
        System.out.println(tel2[0]);
        switch (tel2[0]) {
            case "011":
                System.out.println("SK");
                break;
            case "019":
                System.out.println("LG");
                break;
            default:
                System.out.println("Apple");
                break;
        }

        if (tel2[0].equals("011")) {
            System.out.println("SK");
        } else if (tel2[0].equals("019")) {
            System.out.println("LG");
        } else {
            System.out.println("Apple");
        }
        //4. length()함수 사용
        if (tel2[1].length() >= 4) {
            System.out.println("최신폰");
        } else {
            System.out.println("올드폰");
        }
        //5.  tel2의 모든 값을 더해서 사용
        int sum = tel2[0].length() + tel2[1].length() + tel2[2].length();
        if (sum >= 10) {
            System.out.println("유효한 전화번호");
        } else {
            System.out.println("유효하지 않은 전화번호");
        }
    }
}