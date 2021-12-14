package com.SpringBoot.Repository;

import com.SpringBoot.entity.CustomerDetails;
import com.SpringBoot.entity.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonalRepository extends JpaRepository<PersonalDetails, Integer> {

 //   List<CustomerDetails> findByName(String customerName);
}
