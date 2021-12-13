package com.mySql.Practice.onetomany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CompanyData")
public class OnSiteWorkingData {

    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int noOfHolidays;
    @Column
    private int workingHours;
//    @OneToOne(mappedBy = "onSiteWorkingData")
////    @JsonIgnoreProperties("onSiteWorkingData")   // It Ignores the loop.
//    @JsonBackReference
//    private Employe employe;

}
