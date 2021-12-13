package com.mySql.Practice.controller;

import com.mySql.Practice.entity.Employee;
import com.mySql.Practice.model.EmployeeModel;
import com.mySql.Practice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee" )
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee add(@RequestBody EmployeeModel employee){
        return employeeService.addEmployee(employee);
    }

    @RequestMapping("/all")
    public List<Employee> getAll() { return employeeService.getAll(); }

    @RequestMapping("/get/{id}")
    public Employee getById(Integer id){
        return employeeService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(Integer id){
        employeeService.deleteById(id);
    }

}


