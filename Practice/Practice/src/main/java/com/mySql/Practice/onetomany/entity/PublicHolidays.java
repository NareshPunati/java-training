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
@Table(name = "PublicHoliday")
public class PublicHolidays {

    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String date;
    @Column
    private String description;
    @Column
    private String holidayFinancialYear;

//    @OneToOne(mappedBy = "publicHolidays")
//    @JsonBackReference
//    private  Employe employe;

}
