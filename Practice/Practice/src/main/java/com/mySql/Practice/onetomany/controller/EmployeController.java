package com.mySql.Practice.onetomany.controller;

import com.mySql.Practice.onetomany.entity.Employe;
import com.mySql.Practice.onetomany.entity.OnSiteWorkingData;
import com.mySql.Practice.onetomany.entity.PublicHolidays;
import com.mySql.Practice.onetomany.model.EmployeModel;
import com.mySql.Practice.onetomany.model.OnSiteWorkingDataModel;
import com.mySql.Practice.onetomany.model.PublicHolidaysModel;
import com.mySql.Practice.onetomany.srevice.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @PostMapping("/add")
    public Employe add(@RequestBody EmployeModel employe){
        return employeService.addEmploye(employe);
    }
    @GetMapping("/get/{id}")
    public EmployeModel getById(@PathVariable Integer id){
        return employeService.getEmployeById(id);
    }
    @RequestMapping("/get-all")
    public List<EmployeModel> getAllEmploye() { return employeService.getEmployes(); }

    @PostMapping("/add/Public")
    public PublicHolidays add(@RequestBody PublicHolidaysModel publicHolidaysModel){
        return employeService.addPublicHolidays(publicHolidaysModel);
    }
    @GetMapping("/get/public")
    public List<PublicHolidaysModel> getPublicHolidays(){
        return employeService.getPublicHoliday();
    }
    @PostMapping("/add/data")
    public OnSiteWorkingData add(@RequestBody OnSiteWorkingDataModel onSiteWorkingDataModel){
        return employeService.addOnSiteWorkingData(onSiteWorkingDataModel);
    }
    @GetMapping("/get/data")
    public List<OnSiteWorkingDataModel> getCompanyData(){
        return employeService.getCompanyData();
    }

//    @RequestMapping("/delete/id")
//    public void deleteById(Integer id){
//         employeService.deleteById(id);
//    }
}