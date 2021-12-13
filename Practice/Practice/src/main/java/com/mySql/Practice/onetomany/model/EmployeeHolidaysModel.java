package com.mySql.Practice.onetomany.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeHolidaysModel {

    private int id;
    private String fromDate;
    private String toDate;
    private Boolean halfDay;
    private String description;
}
