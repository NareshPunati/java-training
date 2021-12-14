package com.SpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDetailsModel {

    private int id;
    private Long mobileNumber;
    private String email;
    private String city;

}
