package com.SpringBoot.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CustomerDetails")
public class CustomerDetails {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column
    private String customerName;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private PersonalDetails personalDetails;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,targetEntity = Product.class)
    @JsonManagedReference
    @JoinColumn( name="id") // referencedColumnName = "customerId",
    private List<Product> product;

//    @JsonBackReference
//    @OneToOne(cascade = CascadeType.ALL,mappedBy = "customerDetails")
//    private Main main;

}
