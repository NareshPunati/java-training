package com.mySql.Practice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationsModel {

    private int locationId;
    private String locationName;
    private String locationCountry;
}
