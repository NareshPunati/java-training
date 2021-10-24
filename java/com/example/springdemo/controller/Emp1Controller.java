package com.example.springdemo.controller;

import com.example.springdemo.Model.Employee1;
import com.example.springdemo.Service.Employee1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/emp")
public class Emp1Controller {

    @Autowired
    private Employee1Service employee1Service;


    @PostMapping("/add")
    List<Employee1> add(@RequestBody Employee1 newEmployee){

        return employee1Service.add(newEmployee);
    }

    @GetMapping("/get/{id}")
    Employee1 get(@PathVariable Integer id) {

        return employee1Service.get(id);
    }
    @DeleteMapping("/delete")
    void delete( @RequestHeader int Id) {

        employee1Service.delete(Id);
    }
}

