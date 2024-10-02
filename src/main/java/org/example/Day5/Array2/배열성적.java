package org.example.Day5.Array2;

public class 배열성적 {
    public static void main(String[] args) {
        String[] st = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] arr1 = {44,66,22,99,100};
        int[] arr2 = {22,66,88,99,100};
        int[] arr3  = new int[5];

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0; i<arr1.length; i++)
        {
            System.out.print(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++)
        {
            System.out.print(arr2[i]);
        }
        for(int i=0; i<arr1.length; i++)
            if(arr1[i] == arr2[i])
            {
                cnt1++;
            }
        else if(arr1[i]<arr2[i])
            {
                arr3[i] = i;
                cnt2++;
            }
    }

}
