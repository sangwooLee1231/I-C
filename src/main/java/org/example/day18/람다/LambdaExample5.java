package org.example.day18.람다;

public class LambdaExample5 {
    public static void main(String[] args) {
        DifferenceFunctionalInterface Difference = (a,b) -> a - b;

        int result = Difference.subtract(20,3);
        System.out.println(result);
    }
}
