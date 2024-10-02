

import java.util.Scanner;

public class B2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
        int a = sc.nextInt(); // 테스트 케이스 수를 입력받음
        int q, d, n, p; // 각각 25센트, 10센트, 5센트, 1센트 동전의 개수를 저장할 변수들 선언
        for (int i = 0; i < a; i++) { // 테스트 케이스 수만큼 반복
            int b = sc.nextInt();
            q = b / 25; // 25센트 동전의 개수 계산
            b = b % 25; // 25센트를 제외한 나머지 금액 계산
            d = b / 10; // 10센트 동전의 개수 계산
            b = b % 10; // 10센트를 제외한 나머지 금액 계산
            n = b / 5; // 5센트 동전의 개수 계산
            p = b % 5; // 남은 금액은 1센트로 처리
            System.out.println(q + " " + d + " " + n + " " + p);
        }
        sc.close(); // Scanner 객체 닫기
    }
}
