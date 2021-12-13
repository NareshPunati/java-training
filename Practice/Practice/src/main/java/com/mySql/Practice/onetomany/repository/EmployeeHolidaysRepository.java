package com.mySql.Practice.onetomany.repository;

import com.mySql.Practice.onetomany.entity.EmployeeHolidays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeHolidaysRepository extends JpaRepository<EmployeeHolidays, Integer> {
}
