package com.mySql.Practice.onetomany.repository;

import com.mySql.Practice.onetomany.entity.OnSiteWorkingData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OnSiteWorkingDataRepository extends JpaRepository<OnSiteWorkingData, Integer> {

//    List<OnSiteWorkingData> getData();
}
