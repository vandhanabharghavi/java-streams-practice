package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatenListofLists {
    public static void main(String[] args){
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("c","d")
        );
        List<String> flat = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flat);
    }
}
