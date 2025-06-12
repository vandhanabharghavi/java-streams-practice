package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("van",1,"cse",25,25000));
        list.add(new Employee("mon",2,"mbbs",25,35000));
        list.add(new Employee("shiro",1,"cse",25,45000));
        list.add(new Employee("mom",1,"ece",25,55000));
        Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(map);
    }
}
