package org.example.Day5.Array2;

public class 스트링을배열로2 {
    public static void main(String[] args) {
        String all = "국어, 영어, 수학, 컴퓨터";
        String[] s1 = all.split(",");

        for(int i=0;i<s1.length;i++)
        {
            s1[i] = s1[i].trim();
        }

        System.out.println("과목수는 "+s1.length+"과목");
        int count = 0;
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].equals("컴퓨터")) {
                System.out.println("컴퓨터의 위치는 인덱스>> " + i);
            }
            if(s1[i].length()<3)
                count++;
            }
        System.out.println(count);
    }
}
