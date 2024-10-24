import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 6, 8};
        double[] arr2 = {5.0, 3.0, 1.0, 33.0, 35.0};

        Arrays.stream(arr)
                .filter(a -> a > 3)
                .distinct()
                .forEach(System.out::println);

        double sum = Arrays.stream(arr2).sum();
        System.out.println(sum);

        String[] arr3 = {"정신과", "내과", "신경과", "정형외과"};
        Arrays.stream(arr3).map(a -> a+" 사무실 ").forEach(System.out::print);


    }
    }
