package sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHigh {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2,4,2,4,5,5,6);
        int res = list.stream().sorted(Comparator.reverseOrder())
                .distinct()
                .skip(2).findFirst().get();
        System.out.println(res);
    }
    }
