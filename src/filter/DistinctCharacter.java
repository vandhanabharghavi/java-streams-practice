package filter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctCharacter {
    public static void main(String[] args){
        String s ="Vandhana";
        Map<Object,Long> map = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        for(Map.Entry<Object,Long> m :map.entrySet()){
            if(m.getValue()==1)
                System.out.println(m.getKey());
        }
    }
}
