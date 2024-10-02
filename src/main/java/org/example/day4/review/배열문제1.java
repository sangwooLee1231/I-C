package org.example.day4.review;

public class 배열문제1 {
    public static void main(String[] args) {
        // 3일의 휴가기간 동안 매일 다른 곳을 여행가려 함.
        // 여행가고 싶은 지역 3개를 배열에 넣기
        // 2. 여행지역마다의 경비(처음부터 알고 있는 경우
        // 3. 함께 가고 싶은 사람 이름(처음에는 모름.)
        // 첫 번째 여행지만 "친구"로 나중에 결정됨.
        // 다음과 같이 출력
        // 제주도 50000 친구
        // 울릉도 40000 null
        // 송도   10000 동생

        String[] trip = {"제주도","울릉도","송도"};
        int[] money = {50000,40000,10000};
        String[] pp = new String[3];
        pp[0] = "친구";
        pp[2] = "동생";

        for(int i=0;i<3;i++)
        {
            System.out.println(trip[i]+" "+money[i]+" "+pp[i]);
        }

    }
}
