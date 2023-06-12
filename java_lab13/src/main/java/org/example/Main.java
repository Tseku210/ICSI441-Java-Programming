package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = createRandomEmployees(10);
//        List<Integer> ids = employees.stream()
//                .map(Employee::getId)
//                .collect(Collectors.toList());
        double dundajTsalin = employees.stream()
                .mapToDouble(Employee::getSalary)
                .reduce(0, (acc, salary) -> acc + salary) / employees.size();

        System.out.println(dundajTsalin);
    }

    private static List<Employee> createRandomEmployees(int count) {
        Random random = new Random();
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            Employee emp = new Employee(random.nextInt(100) + 1, "Ажилчин " + i, random.nextDouble() * 10000);
            employees.add(emp);
            System.out.println(emp.getId() + ": " + emp.getName() + ": " + emp.getSalary());
        }
        return employees;
    }
}