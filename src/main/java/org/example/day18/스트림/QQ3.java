package org.example.day18.스트림;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class QQ3
{
    public static void main(String[] args) {
        Random r = new Random();

        int[] arr = new int[200];
      Arrays.stream(arr).map(a->a=r.nextInt(201)-100).filter(a->a>0).map(a->a=a*a).filter(a->a>1000).average().ifPresent(a->System.out.println(a));





    }
}
