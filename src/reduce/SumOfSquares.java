package reduce;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sqResults = list.stream().map(n->n*n)
                .reduce(0,Integer::sum);
        System.out.println(sqResults);

        int sum1 = list.stream().mapToInt(x->x*x).sum();
        System.out.println(sum1);
    }
}
