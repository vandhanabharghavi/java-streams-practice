package frequency;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWord {
    public static void main(String[] args){
        String s = " I am am the the van van and van";
        Map<Object,Long> map = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map);
    }
}
