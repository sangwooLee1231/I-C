package org.example.day4.review;

public class 배열생성 {
    public static void main(String[] args) {
        // 배열을 생성할 때
        // 1. 처음부터 값을 알고있는 경우
        int[] days = {1,3,4,5,6};
        // 2. 처음에는 모르고 있는 경우
        String[] doing = new String[5];
        doing[0] = "쉬기"; // String --> "", Char --> ''
        doing[1] = "서울숲";
        System.out.println(days);
        System.out.println(doing);

        double[] temp = {22,20,15,17,19};
        for (int i = 0; i < temp.length; i++) {
            System.out.println(days[i] + " " + doing[i] + " " + temp[i]);
        }
        // 가능하지만 기능이 꺼내오는 용도로만 사용 가능하다.
        for(double t : temp){
            // temp라는 배열을 앞에서부터 순서대로 있는지 체크해서 꺼내어 t라는 변수에 삽입하는 for문(for-each문)
            System.out.println(t);
        }
    }
}
