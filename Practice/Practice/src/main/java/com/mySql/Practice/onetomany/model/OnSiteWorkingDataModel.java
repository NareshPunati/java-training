package com.mySql.Practice.onetomany.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OnSiteWorkingDataModel {

    private int id;
    private int noOfHolidays;
    private int workingHours;
}
