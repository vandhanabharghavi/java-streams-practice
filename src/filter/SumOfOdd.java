package filter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfOdd {
    public static void main(String[] args) {
        int[] arr = {3,7,10};
        int sum2 = Arrays.stream(arr).boxed().filter(x -> x % 2 != 0)
                .mapToInt(x -> x).sum();
        System.out.println(sum2);
    }
    }
