package com.SpringBoot.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PersonalDetails")
public class PersonalDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Long mobileNumber;
    @Column
    private String email;
    @Column
    private String city;

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personalDetails")
    private CustomerDetails customerDetails;

//    @JsonBackReference
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personalDetails")
//    private Main main;

}
