package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPalindromeStrings {
    public static void main(String[] args){
        List<String> list = Arrays.asList("I","am","hello","ana");
        List<String> result = list.stream()
                .filter(word->word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
