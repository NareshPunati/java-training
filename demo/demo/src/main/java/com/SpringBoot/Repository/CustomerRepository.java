package com.SpringBoot.Repository;

import com.SpringBoot.entity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {

 //   List<CustomerDetails> findByName(String customerName);
}
