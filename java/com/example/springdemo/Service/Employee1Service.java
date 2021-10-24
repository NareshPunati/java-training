package com.example.springdemo.Service;

import com.example.springdemo.Model.Employee1;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Employee1Service {

    private List<Employee1> employee1s;

    public List<Employee1> add(Employee1 emp) {
        if (employee1s == null) {
            employee1s = new ArrayList<>();
        }
        employee1s.add(emp);
        return employee1s;

    }

    public Employee1 get(int id) {

        Optional<Employee1> first = employee1s.stream().filter(employee1 -> employee1.getEmployeeId() == id)
                .findFirst();

        return first.isPresent() ? first.get() : null;
    }

    public void delete(int id) {

        Optional<Employee1> first = employee1s.stream().filter(employee1 -> employee1.getEmployeeId() == id)
                .findFirst();

        first.ifPresent(employee -> employee1s.remove(employee));
    }
}