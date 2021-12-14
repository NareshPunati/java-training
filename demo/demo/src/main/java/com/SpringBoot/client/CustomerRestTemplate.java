package com.SpringBoot.client;

import com.SpringBoot.model.CustomerDetailsModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerRestTemplate {

    public CustomerDetailsModel[] getCustomers() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8085/customer/get-all";
        ResponseEntity<CustomerDetailsModel[]> response
                = restTemplate.getForEntity(fooResourceUrl, CustomerDetailsModel[].class);
        System.out.println(response.getStatusCode());
        return response.getBody();
    }

    public String addCustomer(CustomerDetailsModel customerDetailsModel) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8085/customer/add";
        HttpEntity<CustomerDetailsModel> request = new HttpEntity<>(customerDetailsModel);
        ResponseEntity<String> response = restTemplate.exchange(fooResourceUrl, HttpMethod.POST,
                request, String.class);
        return response.getBody();
    }
}
