package com.SpringBoot.Repository;

import com.SpringBoot.entity.CustomerDetails;
import com.SpringBoot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
 //   List<CustomerDetails> findByName(String customerName);
}
