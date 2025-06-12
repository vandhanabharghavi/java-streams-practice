package employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2,3,6,5};
        Optional<Integer> x = Arrays.stream(arr).boxed().max(Comparator.comparing(Integer::intValue));
        System.out.println(x);
    }
    }
