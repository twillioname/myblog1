package com.myblog.myblog1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {

        List<Employee>employees= Arrays.asList(
                new Employee("mike",25,"chennai"),
                new Employee("aadi",32,"chennai"),
                new Employee("chand",25,"patna"),
                new Employee("sam",31,"pune")
        );

        List<Employee>emps = employees.stream().filter(emp ->emp.getAge()>24).collect(Collectors.toList());

        for (Employee e :emps){
            System.out.println(e.getName());
            System.out.println(e.getCity());
            System.out.println(e.getAge());
        }
    }
}
