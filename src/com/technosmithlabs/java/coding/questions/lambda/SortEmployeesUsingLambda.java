package com.technosmithlabs.java.coding.questions.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesUsingLambda {

    private static final List<Employee> employeesList = Arrays.asList(
            new Employee("Mr. A", 21),
            new Employee("Mr. B", 22),
            new Employee("Mr. C", 23),
            new Employee("Mr. D", 24)
    );

    public static void main(String[] args) {
        // filtering Employee Name list to obtain a filtered list where employee's age is even number
        final List<String> filteredEmployeeNameList = employeesList.stream().filter(e -> {
                    return e.getAge() % 2 == 0;
                }
        ).map(e -> e.getName()).collect(Collectors.toList());
        System.out.println("Employee names are: " + filteredEmployeeNameList);
        final List<Integer> filteredEmployeeAgeList = employeesList.stream().filter(e -> e.getAge() % 2 == 0)
                .map(Employee::getAge).collect(Collectors.toList());
        System.out.println("Employee Ages are: " + filteredEmployeeAgeList);
    }
}

class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
