package com.mySql.Practice.services;

import com.mySql.Practice.entity.Benefits;
import com.mySql.Practice.entity.Department;
import com.mySql.Practice.entity.Employee;
import com.mySql.Practice.entity.Locations;
import com.mySql.Practice.model.BenefitsModel;
import com.mySql.Practice.model.DepartmentModel;
import com.mySql.Practice.model.EmployeeModel;
import com.mySql.Practice.model.LocationsModel;
import com.mySql.Practice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee addEmployee(EmployeeModel employee){

        Department dept = new Department();
        dept.setDeptName(employee.getDepartmentModel().getDeptName());

        Benefits benefits = new Benefits();
        benefits.setBenefitName(employee.getBenefitsModel().getBenefitName());
        benefits.setDescription(employee.getBenefitsModel().getDescription());

        Locations locations = new Locations();
        locations.setLocationName(employee.getLocationsModel().getLocationName());
        locations.setLocationCountry(employee.getLocationsModel().getLocationCountry());

        Employee emp = new Employee();
        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        emp.setMobileNumber(employee.getMobileNumber());
        emp.setSalary(employee.getSalary());
        emp.setDept(dept);
        emp.setBenefits(benefits);
        emp.setLocations(locations);

        return employeeRepository.save(emp);
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee getById(Integer id){
        return employeeRepository.findById(id).orElse(null);
    }

    public void deleteById(Integer id){
        employeeRepository.deleteById(id);
    }

//  private  EmployeeModel getEmployeeModel(Employee emp) {
//
//        EmployeeModel employeeModel = new EmployeeModel();
//
//        DepartmentModel departmentModel= new DepartmentModel();
//        departmentModel.setDeptId(departmentModel.getDeptId());
//        departmentModel.setDeptName(departmentModel.getDeptName());
//
//        LocationsModel locationsModel = new LocationsModel();
//        locationsModel.setLocationId(locationsModel.getLocationId());
//        locationsModel.setLocationName(locationsModel.getLocationName());
//        locationsModel.setLocationCountry(locationsModel.getLocationCountry());
//
//        BenefitsModel benefitsModel = new BenefitsModel();
//        benefitsModel.setBenefitId(benefitsModel.getBenefitId());
//        benefitsModel.setBenefitName(benefitsModel.getBenefitName());
//        benefitsModel.setDescription(benefitsModel.getDescription());
//
//        employeeModel.setName(emp.getName());
//        employeeModel.setEmail(emp.getEmail());
//        employeeModel.setMobileNumber(emp.getMobileNumber());
//        employeeModel.setSalary(emp.getSalary());
//        employeeModel.setDepartmentModel(departmentModel);
//        employeeModel.setLocationsModel(locationsModel);
//        employeeModel.setBenefitsModel(benefitsModel);
//
//        return employeeModel;
//  }


}
