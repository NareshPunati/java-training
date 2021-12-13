package com.mySql.Practice.entity;

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
@Table(name = "Benefits")
public class Benefits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int benefitId;
    @Column
    private String benefitName;
    @Column
    private String description;
    @OneToOne(mappedBy = "benefits")
    private Employee employee;
}
