//package com.SpringBoot.entity;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name = "MainTable")
//public class Main {
//
//    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long mainId;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private CustomerDetails customerDetails;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private PersonalDetails personalDetails;
//
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL,targetEntity = Product.class)
//    @JsonManagedReference
//    @JoinColumn(referencedColumnName = "mainId", name="id")
//    private List<Product> product;
//}
