package com.mySql.Practice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {

    private String name;
    private String email;
    private Long mobileNumber;
    private Float salary;
    private DepartmentModel departmentModel;
    private BenefitsModel benefitsModel;
    private LocationsModel locationsModel;


}
