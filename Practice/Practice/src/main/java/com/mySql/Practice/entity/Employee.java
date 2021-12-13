package com.mySql.Practice.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private Long mobileNumber;
    @Column
    private Float salary;
    @OneToOne(cascade = CascadeType.ALL)
    private Department dept;
    @OneToOne(cascade = CascadeType.ALL)
    private Benefits benefits;
    @OneToOne(cascade = CascadeType.ALL)
    private Locations locations;

}
