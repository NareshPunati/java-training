package com.mySql.Practice.onetomany.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employe")
public class Employe {

    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private Long phoneNo;
    @Column
    private String designation;
    @Column
    private Float salary;
    @Column
    private String addressLine1;
    @Column
    private String city;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,targetEntity = EmployeeHolidays.class)
    @JsonManagedReference
//    @JoinColumn(referencedColumnName = "employeeId") //, name="id"
    private List<EmployeeHolidays> employeeHolidays;

//    @JsonManagedReference
//    @OneToOne(cascade = CascadeType.ALL)
//    private PublicHolidays publicHolidays;
//
//    @JsonManagedReference
//    @OneToOne(cascade = CascadeType.ALL)
//    private OnSiteWorkingData onSiteWorkingData;
}
