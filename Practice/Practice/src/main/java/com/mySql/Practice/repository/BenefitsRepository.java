package com.mySql.Practice.repository;


import com.mySql.Practice.entity.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenefitsRepository extends JpaRepository<Benefits, Integer> {
}
