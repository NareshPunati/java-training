package com.mySql.Practice.repository;

import com.mySql.Practice.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationsRepository extends JpaRepository<Locations, Integer> {

}
