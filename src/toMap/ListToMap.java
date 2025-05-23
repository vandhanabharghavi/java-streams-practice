package toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Hi","I","van");
        Map<String,Integer> map = list.stream()
        .collect(Collectors.toMap(n->n, String::length));
        System.out.println(map);
    }
}
