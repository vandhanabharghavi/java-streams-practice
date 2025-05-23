package reverse;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String[] args){
        String s = "I am vandhana!";
        String result = Arrays.stream(s.split(" "))
                .map(x->new StringBuilder(x).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);

    }
}
