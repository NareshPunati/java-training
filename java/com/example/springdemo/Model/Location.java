package com.example.springdemo.Model;

import java.util.ArrayList;
import java.util.List;

public class Location {

    private String locationName;
    private String locationCountry;

    public Location (String locationName, String locationCountry) {
        this.locationName = locationName;
        this.locationCountry = locationCountry;
    }

    List<Location> locations = new ArrayList<>();
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationCountry() {
        return locationCountry;
    }

    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

}
