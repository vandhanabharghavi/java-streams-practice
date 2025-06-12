package employee;

import java.util.*;
import java.util.stream.Collectors;

public class MaxSal {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("van",1,"cse",25,25000));
        list.add(new Employee("mon",2,"mbbs",25,35000));
        list.add(new Employee("shiro",1,"cse",25,45000));
        list.add(new Employee("mom",1,"ece",25,55000));
        Optional<Employee> sal = list.stream().max(Comparator.comparing(Employee::getSal));
        System.out.println(sal);

        List<Employee> salMore = list.stream().filter(x->x.getSal()>25000).toList();
        System.out.println(salMore);


        List<Integer> arr = Arrays.asList(10, 15, 22, 33, 40, 55);

        List<Integer> evenList = arr.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenList);

        List<String> words = Arrays.asList("apple", "banana", "apricot", "grape", "avocado", "berry");

        List<String> result = words.stream()
                .filter(s -> !s.startsWith("a")) // filter out those starting with 'a'
                .toList();

        List<String> result1 = words.stream()
                .map(String::toLowerCase) // transforms all to lowercase
                .filter(s -> !s.startsWith("a")) // filters those NOT starting with 'a'
                .toList();

    }
    }
