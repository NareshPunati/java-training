package com.mySql.Practice.onetomany.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "EmpHolidays")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeHolidays {

    @Id
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String fromDate;
    @Column
    private String toDate;
    @Column
    private Boolean halfDay;
    @Column
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonBackReference
 //   @JoinColumn(name ="employeId")
    private  Employe employe;


}
