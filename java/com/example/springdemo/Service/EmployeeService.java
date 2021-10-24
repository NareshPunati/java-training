package com.example.springdemo.Service;

import com.example.springdemo.Model.Department;
import com.example.springdemo.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private List<Employee> employees;

    public List<Employee> add(Employee employee) {
        if (employees == null) {
            employees = new ArrayList<>();
        }
        employees.add(employee);
        return employees;
    }

    public Employee get(int id) {

        Optional<Employee> first = employees.stream().filter(employee -> employee.getId() == id).findFirst();

        return first.isPresent() ? first.get() : null;
    }

    public List<Employee> get(String branch) {

        List<Employee> employeesList = employees.stream().filter(employee -> employee.
                getBranch().equals(branch)).collect(Collectors.toList());

        return employeesList;
    }

    public void delete(int id) {

        Optional<Employee> first = employees.stream().filter(employee -> employee.getId() == id).findFirst();

        first.ifPresent(employee -> employees.remove(employee));
    }

}
