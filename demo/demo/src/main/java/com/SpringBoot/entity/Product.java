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
@Table(name = "Product")
public class Product {

    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @Column
    private String productName;
    @Column
    private int quantity;
    @Column
    private Double price;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private CustomerDetails customerDetails;

//    @JsonBackReference
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//  //  @JoinColumn(name="customerId",referencedColumnName = "mainId")
//    private Main main;

}
