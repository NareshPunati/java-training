package com.SpringBoot.service;

import com.SpringBoot.Repository.CustomerRepository;
import com.SpringBoot.entity.CustomerDetails;
import com.SpringBoot.entity.PersonalDetails;
import com.SpringBoot.entity.Product;
import com.SpringBoot.model.CustomerDetailsModel;
import com.SpringBoot.model.PersonalDetailsModel;
import com.SpringBoot.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    CustomerDetails customerDetails = new CustomerDetails();

    public CustomerDetails addCustomer(CustomerDetailsModel customer) {

        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setMobileNumber(customer.getPersonalDetailsModel().getMobileNumber());
        personalDetails.setEmail(customer.getPersonalDetailsModel().getEmail());
        personalDetails.setCity(customer.getPersonalDetailsModel().getCity());

        List<Product> productList = new ArrayList<>();
        customer.getProductModel().forEach(p -> {
            Product product = new Product();
            product.setProductId(p.getProductId());
            product.setProductName(p.getProductName());
            product.setQuantity(p.getQuantity());
            product.setPrice(p.getPrice());
            productList.add(product);

        });

        customerDetails.setCustomerId(customer.getCustomerId());
        customerDetails.setCustomerName(customer.getCustomerName());
        customerDetails.setPersonalDetails(personalDetails);
        customerDetails.setProduct(productList);

        return customerRepository.save(customerDetails);
    }

    private CustomerDetailsModel getCustomerDetailsModel(CustomerDetails cd) {
        CustomerDetailsModel customerDetailsModel = new CustomerDetailsModel();

        PersonalDetailsModel personalDetailsModel = new PersonalDetailsModel();
        personalDetailsModel.setId(cd.getPersonalDetails().getId());
        personalDetailsModel.setMobileNumber(cd.getPersonalDetails().getMobileNumber());
        personalDetailsModel.setEmail(cd.getPersonalDetails().getEmail());
        personalDetailsModel.setCity(cd.getPersonalDetails().getCity());

        List<ProductModel> productModelList = new ArrayList<>();
        cd.getProduct().forEach(p -> {
            ProductModel productModel = new ProductModel();
            productModel.setProductId(p.getProductId());
            productModel.setProductName(p.getProductName());
            productModel.setQuantity(p.getQuantity());
            productModel.setPrice(p.getPrice());
            productModelList.add(productModel);
        });

        customerDetailsModel.setCustomerId(cd.getCustomerId());
        customerDetailsModel.setCustomerName(cd.getCustomerName());
        customerDetailsModel.setPersonalDetailsModel(personalDetailsModel);
        customerDetailsModel.setProductModel(productModelList);

        return customerDetailsModel;
    }

    public List<CustomerDetailsModel> getCustomers() {
        List<CustomerDetails> cd = customerRepository.findAll();
        return cd.stream().map(customer -> getCustomerDetailsModel(customer)).collect(Collectors.toList());
    }

    public CustomerDetailsModel getById(Integer id){
       Optional<CustomerDetails> cd = customerRepository.findById(id);
       if (cd.isPresent()){
                                 return getCustomerDetailsModel(cd.get());
                            }
       return null;
    }

//    public List<CustomerDetailsModel> getByName(String customerName){
//        List<CustomerDetails> customerDetails = customerRepository.findByName(customerName);
//        return customerDetails.stream().map(c -> getCustomerDetailsModel(c)).collect(Collectors.toList());
//    }

}