package com.mySql.Practice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BenefitsModel {

    private int benefitId;
    private String benefitName;
    private String description;
}
