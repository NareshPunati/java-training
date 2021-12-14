package com.SpringBoot.Controller;

import com.SpringBoot.entity.CustomerDetails;
import com.SpringBoot.model.CustomerDetailsModel;
import com.SpringBoot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public CustomerDetails addCustomer(@RequestBody CustomerDetailsModel customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/get-all")
    public List<CustomerDetailsModel> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/get/{id}")
    public CustomerDetailsModel getCustomerById(@PathVariable Integer id){
        return customerService.getById(id);
    }

//    @PostMapping("/get/{name}")
//    public List<CustomerDetailsModel> getByName(@RequestBody CustomerDetailsModel c){
//        return  customerService.getByName(c.getCustomerName());
//    }

//    @DeleteMapping("/delete/{id}")
//    public void deleteCustomerById(@PathVariable Long id){
//        mainService.deleteCustomerById(id);
//    }

 }
