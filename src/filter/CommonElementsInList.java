package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsInList {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(2,3,6,7,5);
        List<Integer> common = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(common);
    }
}
