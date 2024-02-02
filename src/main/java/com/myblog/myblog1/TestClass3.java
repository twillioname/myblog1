package com.myblog.myblog1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestClass3 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("mike", 25, "chennai"),
                new Employee("aadi", 32, "chennai"),
                new Employee("chand", 25, "patna"),
                new Employee("sam", 31, "pune")
        );

        Map<Integer, List<Employee>>collect = employees.stream().collect(Collectors.groupingBy(e->e.getAge()));
        System.out.println(collect.get(25));
    }
}
