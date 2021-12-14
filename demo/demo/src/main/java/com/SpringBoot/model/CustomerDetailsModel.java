package com.SpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetailsModel {

    private int customerId;
    private String customerName;
    private PersonalDetailsModel personalDetailsModel;
    private List<ProductModel> productModel;
}
