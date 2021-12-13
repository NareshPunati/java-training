package com.mySql.Practice.onetomany.repository;

import com.mySql.Practice.onetomany.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
