package com.mySql.Practice.onetomany.model;

import com.mySql.Practice.onetomany.entity.EmployeeHolidays;
import com.mySql.Practice.onetomany.entity.OnSiteWorkingData;
import com.mySql.Practice.onetomany.entity.PublicHolidays;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeModel {

    private int employeeId;
    private String name;
    private String email;
    private Long phoneNo;
    private String designation;
    private Float salary;
    private String addressLine1;
    private String city;
    private List<EmployeeHolidaysModel> employeeHolidaysModels;
//    private PublicHolidaysModel publicHolidaysModel;
//    private OnSiteWorkingDataModel onSiteWorkingDataModel;

}
