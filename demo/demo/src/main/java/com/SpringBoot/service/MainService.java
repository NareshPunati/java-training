//package com.SpringBoot.service;
//
//import com.SpringBoot.Repository.MainRepository;
//import com.SpringBoot.entity.CustomerDetails;
//import com.SpringBoot.entity.Main;
//import com.SpringBoot.entity.PersonalDetails;
//import com.SpringBoot.entity.Product;
//import com.SpringBoot.model.CustomerDetailsModel;
//import com.SpringBoot.model.MainModel;
//import com.SpringBoot.model.PersonalDetailsModel;
//import com.SpringBoot.model.ProductModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class MainService {
//
//    @Autowired
//    private MainRepository mainRepository;
//
//    Main main = new Main();
//    public Main addCustomer(MainModel customer) {
//
//            CustomerDetails customerDetails = new CustomerDetails();
//            customerDetails.setName(customer.getCustomerDetailsModel().getName());
//            customerDetails.setMain(main);
//
//            PersonalDetails personalDetails = new PersonalDetails();
//            personalDetails.setMobileNumber(customer.getPersonalDetailsModel().getMobileNumber());
//            personalDetails.setEmail(customer.getPersonalDetailsModel().getEmail());
//            personalDetails.setCity(customer.getPersonalDetailsModel().getCity());
//            personalDetails.setMain(main);
//
//            List<Product> productList = new ArrayList<>();
//            customer.getProductModel().forEach(c -> {
//                Product product = new Product();
//                product.setProductId(c.getProductId());
//                product.setProductName(c.getProductName());
//                product.setQuantity(c.getQuantity());
//                product.setPrice(c.getPrice());
//                product.setMain(main);
//                productList.add(product);
//            });
//
//            main.setMainId(customer.getMainId());
//            main.setCustomerDetails(customerDetails);
//            main.setPersonalDetails(personalDetails);
//            main.setProduct(productList);
//
//            return mainRepository.save(main);
//
//    }
// // <-----------------------------Converting Model to Entity------------------------------------------------------>
//    private MainModel getMainModel(Main main){
//        MainModel mainModel = new MainModel();
//
//        CustomerDetailsModel customerDetailsModel = new CustomerDetailsModel();
//        customerDetailsModel.setCustomerId(main.getCustomerDetails().getCustomerId());
//        customerDetailsModel.setName(main.getCustomerDetails().getName());
//
//        PersonalDetailsModel personalDetailsModel = new PersonalDetailsModel();
//        personalDetailsModel.setId(main.getPersonalDetails().getId());
//        personalDetailsModel.setMobileNumber(main.getPersonalDetails().getMobileNumber());
//        personalDetailsModel.setEmail(main.getPersonalDetails().getEmail());
//        personalDetailsModel.setCity(main.getPersonalDetails().getCity());
//
//        List<ProductModel> productModelList = new ArrayList<>();
//        main.getProduct().forEach(p -> {
//            ProductModel productModel = new ProductModel();
//            productModel.setProductId(p.getProductId());
//            productModel.setProductName(p.getProductName());
//            productModel.setPrice(p.getPrice());
//            productModel.setQuantity(p.getQuantity());
//            productModelList.add(productModel);
//        });
//          mainModel.setMainId(main.getMainId());
//          mainModel.setCustomerDetailsModel(customerDetailsModel);
//          mainModel.setPersonalDetailsModel(personalDetailsModel);
//          mainModel.setProductModel(productModelList);
//
//          return mainModel;
//}
//    public List<MainModel> getCustomers() {
//        List<Main> main = mainRepository.findAll();
//        return main.stream().map(customer -> getMainModel(customer)).collect(Collectors.toList());
//    }
//
//    public MainModel getCustomerById(Long id){
//       Optional<Main> main = mainRepository.findById(id);
//       if (main.isPresent()){
//           return getMainModel(main.get());
//       }      return null;
//    }
//
////    public void deleteCustomerById(Long id){
////     mainRepository.deleteById(id);
////    }
//
//    public List<CustomerDetailsModel> getByName(String name){
//        List<CustomerDetails> customerDetails = mainRepository.findByName(name);
//        return customerDetails.stream().map(c -> getMainModel(c)).collect(Collectors.toList());
//    }
//
//    private CustomerDetailsModel getMainModel(CustomerDetails c) {  return null;
//    }
//
////       List<Main> main = mainRepository.findByCity(city);
////       return main.stream().map(c -> getMainModel(c)).collect(Collectors.toList());
////    }
////      public List<CustomerDetailsModel>
//
//
//
////----------------------------------------------------------------------------------------------------------------
////  //      PersonalDetails personalDetails = null;
////        PersonalDetails personalDetails = new PersonalDetails();
////        personalDetails.setMobileNumber(customer.getPersonalDetailsModel().getMobileNumber());
////        personalDetails.setEmail(customer.getPersonalDetailsModel().getEmail());
////        personalDetails.setCity(customer.getPersonalDetailsModel().getCity());
//// //       personalDetails.setCustomerDetails(customerDetails);
////
////
//////        List<Product> productList = new ArrayList<>();
//////        customer.getProductModel().stream().map(c -> {
//////            Product product = new Product();
//////            product.setProductName(c.getProductName());
//////            product.setPrice(c.getPrice());
//////        productList.add(product);
//////            return productList;
//////        });
////
////        List<Product> productList = new ArrayList<>();
////        customer.getProductModel().forEach(c -> {
////            Product product = new Product();
////            product.setProductName(c.getProductName());
////            product.setPrice(c.getPrice());
//// //           product.setCustomerDetails(customerDetails);
////            productList.add(product);
////
////        });
////
////        customerDetails.setName(customer.getName());
////        customerDetails.setPersonalDetails(personalDetails);
////        customerDetails.setProduct(productList);
////
////        return customerDetailsRepository.save(customerDetails);
////}
////        public List<CustomerDetails> getAllCustomer(){
////        return customerDetailsRepository.findAll();
////        }
//
//
//
//}
