package sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortWordLength {
    public static void main(String[] args){
        String s = "I am vandhana bharghavi and you ?";
        List<String> list = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
