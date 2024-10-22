package org.example.day15.제너릭;

public class Truck사용 {
    public static void main(String[] args) {
        Truck<String, Integer> truck1 = new Truck<>();
        truck1.weight = "중량무게";
        truck1.distance = 100;

        Truck<Double, String> truck2 = new Truck<>();
        truck2.weight = 133.3;
        truck2.distance = "장거리";


        System.out.println(truck1);
        System.out.println(truck2);

    }
}
