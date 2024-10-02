package org.example.day4.array;

public class 성적변동문제 {
    public static void main(String[] args) {
        int[] term1 = {77,88,99,55,70};
        int[] term2 = {99,100,88,80,70};
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<term1.length; i++)
        {
            if(term1[i] < term2[i])
                count1++;
            else if(term1[i] == term2[i])
                count2++;
        }
        System.out.println("2학기에 성적이 향상된 학생의 수 : "+count1);
        System.out.println("1,2학기 성적이 동일한 학생의 수 : "+count2);
    }
}
