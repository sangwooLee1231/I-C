package org.example.day12.상속;

public class 볼펜 extends 학용품{
   int size;

   public void write() {
       System.out.println("글을 썻다");
   }

    @Override
    public String toString() {
        return "볼펜{" +
                "size'=" + size + '\'' +
                ", price=" + price +
                ", company=" + company +
                '}';
    }
}
