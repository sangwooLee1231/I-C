package org.example.Baek;
import java.util.Scanner;

public class B25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = new String[20];  // 과목명
        double[] arr2 = new double[20];  // 학점 수
        String[] arr3 = new String[20];  // 성적
        double sum1 = 0;  // 총 학점 수
        double sum2 = 0;  // 총 가중 학점

        for (int i = 0; i < 20; i++) {
            arr1[i] = sc.next();          // 과목명 입력
            arr2[i] = sc.nextDouble();    // 학점 수 입력
            arr3[i] = sc.next();          // 성적 입력

            double gradePoint = 0.0;

            // 성적에 따른 점수 할당
            if (arr3[i].equals("A+")) {
                gradePoint = 4.5;
            } else if (arr3[i].equals("A0")) {
                gradePoint = 4.0;
            } else if (arr3[i].equals("B+")) {
                gradePoint = 3.5;
            } else if (arr3[i].equals("B0")) {
                gradePoint = 3.0;
            } else if (arr3[i].equals("C+")) {
                gradePoint = 2.5;
            } else if (arr3[i].equals("C0")) {
                gradePoint = 2.0;
            } else if (arr3[i].equals("D+")) {
                gradePoint = 1.5;
            } else if (arr3[i].equals("D0")) {
                gradePoint = 1.0;
            } else if (arr3[i].equals("F")) {
                gradePoint = 0.0;
            } else if (arr3[i].equals("P")) {
                // "P" (Pass)인 경우는 평점 계산에서 제외 (학점과 성적 모두 제외)
                continue;
            }

            // 가중 학점 계산 (학점 수 * 성적)
            sum2 += arr2[i] * gradePoint;

            // 총 학점 수 (성적이 F나 P가 아닌 경우만 학점에 포함)
            if (!arr3[i].equals("F")) {
                sum1 += arr2[i];
            }
        }

        // 총 평점 출력
        if (sum1 != 0) {
            System.out.printf("%.6f", sum2 / sum1);
        } else {
            System.out.println("0.000000");
        }
    }
}

/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		double result = 0, credit_sum = 0; // result = 학점*과목평균, credit_sum = 학점의 총합
		char c;

		for(int i=0;i<20;i++) {
			double credit = 0; // 학점
			double grade = 0; // 등급에 따른 점수

			String str_arr[] = sc.nextLine().split(" ");
			credit += Double.parseDouble(str_arr[1]);
			c = str_arr[2].charAt(0);

			switch(c) {
			case 'A':
				if(str_arr[2].charAt(1) == '+') grade += 4.5;
				else grade += 4.0;
				break;
			case 'B':
				if(str_arr[2].charAt(1) == '+') grade += 3.5;
				else grade += 3.0;
				break;
			case 'C':
				if(str_arr[2].charAt(1) == '+') grade += 2.5;
				else grade += 2.0;
				break;
			case 'D':
				if(str_arr[2].charAt(1) == '+') grade += 1.5;
				else grade += 1.0;
				break;
			case 'F':
				grade += 0;
				break;
			case 'P':
				grade += 0;
				credit = 0;
				break;
			}
			credit_sum += credit;
			result += credit*grade;
		}
		sc.close();

		System.out.println(result/credit_sum);
	}
}
 */