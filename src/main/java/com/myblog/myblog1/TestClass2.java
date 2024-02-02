package com.myblog.myblog1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass2 {
    public static void main(String[] args) {

        List<Employee> employee = Arrays.asList(
                new Employee("mike", 25, "chennai"),
                new Employee("aadi", 32, "chennai"),
                new Employee("chand", 25, "patna"),
                new Employee("sam", 31, "pune")
        );
//groupingBy object

        Map<String, List<Employee>> Collect = employee.stream().collect(Collectors.groupingBy(e -> e.getCity()));
        System.out.println(Collect);
    }
}
