package com.example.springdemo.controller;

import com.example.springdemo.Service.EmployeeService;
import com.example.springdemo.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

        @Autowired
        private EmployeeService employeeService;

        @PostMapping("/add")
        List<Employee> add(@RequestBody Employee newEmployee) {

            return employeeService.add(newEmployee);
        }

        @GetMapping("/get/{id}")
        Employee get(@PathVariable Integer id) {

            return employeeService.get(id);
        }

        @DeleteMapping("/delete")
        void delete( @RequestHeader int Id) {

            employeeService.delete(Id);
        }

    }
