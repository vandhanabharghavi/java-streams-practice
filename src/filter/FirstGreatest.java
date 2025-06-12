package filter;

import java.util.Arrays;
import java.util.List;

public class FirstGreatest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,45,55,20,80);
        int x = list.stream().filter(y->y>50).findFirst().get();
        System.out.println(x);
    }
    }
