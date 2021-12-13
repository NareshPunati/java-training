package com.mySql.Practice.onetomany.repository;

import com.mySql.Practice.onetomany.entity.PublicHolidays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicHolidayRepository extends JpaRepository<PublicHolidays, Integer> {
}
