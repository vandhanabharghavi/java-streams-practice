package filter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesInteger {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,2,2,3,3,1,2,4,5);
        Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        for(Map.Entry<Integer,Long> e :map.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey());
            }
        }
    }
}
