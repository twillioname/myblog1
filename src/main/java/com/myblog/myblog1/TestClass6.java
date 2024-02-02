package com.myblog.myblog1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass6 {
    public static void main(String[] args) {

        List<Employee>employees= Arrays.asList(
                new Employee("mike",25,"chennai"),
                new Employee("aadi",32,"chennai"),
                new Employee("chand",25,"patna"),
                new Employee("sam",31,"pune")
        );

        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e->e.getCity()));

        for (Map.Entry<String,List<Employee>>entry:collect.entrySet()) {
            String city = entry.getKey();
            List<Employee>employeesWithCity= entry.getValue();
            System.out.println("city" +city+ "---");

            for (Employee e : employeesWithCity){
                System.out.println(e.getName());
                System.out.println(e.getCity());
            }
        }
    }
}
