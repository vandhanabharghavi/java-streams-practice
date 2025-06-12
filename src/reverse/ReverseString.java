package reverse;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args){
        String s = "I am Vandhana";
        String res = Arrays.stream(s.split(" ")).map(x->new StringBuilder(x).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(res);
    }
}
