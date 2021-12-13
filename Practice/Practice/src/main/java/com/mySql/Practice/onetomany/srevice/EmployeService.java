package com.mySql.Practice.onetomany.srevice;

import com.mySql.Practice.onetomany.entity.Employe;
import com.mySql.Practice.onetomany.entity.EmployeeHolidays;
import com.mySql.Practice.onetomany.entity.OnSiteWorkingData;
import com.mySql.Practice.onetomany.entity.PublicHolidays;
import com.mySql.Practice.onetomany.model.EmployeModel;
import com.mySql.Practice.onetomany.model.EmployeeHolidaysModel;
import com.mySql.Practice.onetomany.model.OnSiteWorkingDataModel;
import com.mySql.Practice.onetomany.model.PublicHolidaysModel;
import com.mySql.Practice.onetomany.repository.EmployeRepository;
import com.mySql.Practice.onetomany.repository.OnSiteWorkingDataRepository;
import com.mySql.Practice.onetomany.repository.PublicHolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeService {

    @Autowired
    private EmployeRepository employeRepository;
    @Autowired
    private OnSiteWorkingDataRepository  onSiteWorkingDataRepository;
    @Autowired
    private PublicHolidayRepository publicHolidayRepository;

    Employe employe = new Employe();

    public Employe addEmploye(EmployeModel emp){

//        PublicHolidays ph = new PublicHolidays();
//        ph.setDate(emp.getPublicHolidaysModel().getDate());
//        ph.setDescription(emp.getPublicHolidaysModel().getDescription());
//        ph.setHolidayFinancialYear(emp.getPublicHolidaysModel().getHolidayFinancialYear());
//        ph.setEmploye(employe);
//
//        OnSiteWorkingData oswd = new OnSiteWorkingData();
//        oswd.setNoOfHolidays(emp.getOnSiteWorkingDataModel().getNoOfHolidays());
//        oswd.setWorkingHours(emp.getOnSiteWorkingDataModel().getWorkingHours());
//        oswd.setEmploye(employe);

        List<EmployeeHolidays> employeeHolidaysList = new ArrayList<>();
        emp.getEmployeeHolidaysModels().forEach( e -> {
           EmployeeHolidays employeeHolidays = new EmployeeHolidays();
           employeeHolidays.setId(e.getId());
           employeeHolidays.setFromDate(e.getFromDate());
           employeeHolidays.setToDate(e.getToDate());
           employeeHolidays.setHalfDay(e.getHalfDay());
           employeeHolidays.setDescription(e.getDescription());
           employeeHolidays.setEmploye(employe);
           employeeHolidaysList.add(employeeHolidays);
       });

       employe.setEmployeeId(emp.getEmployeeId());
       employe.setName(emp.getName());
       employe.setEmail(emp.getEmail());
       employe.setPhoneNo(emp.getPhoneNo());
       employe.setDesignation(emp.getDesignation());
       employe.setSalary(emp.getSalary());
       employe.setAddressLine1(emp.getAddressLine1());
       employe.setCity(emp.getCity());
       employe.setEmployeeHolidays(employeeHolidaysList);
//       employe.setPublicHolidays(ph);
//       employe.setOnSiteWorkingData(oswd);

       return employeRepository.save(employe);
    }

    public EmployeModel getEmployeModel(Employe employe){

        EmployeModel employeModel = new EmployeModel();

//        OnSiteWorkingDataModel onSiteWorkingDataModel = new OnSiteWorkingDataModel();
//        onSiteWorkingDataModel.setId(employe.getOnSiteWorkingData().getId());
//        onSiteWorkingDataModel.setNoOfHolidays(employe.getOnSiteWorkingData().getNoOfHolidays());
//        onSiteWorkingDataModel.setWorkingHours(employe.getOnSiteWorkingData().getWorkingHours());
//
//        PublicHolidaysModel publicHolidaysModel = new PublicHolidaysModel();
//        publicHolidaysModel.setId(employe.getPublicHolidays().getId());
//        publicHolidaysModel.setDate(employe.getPublicHolidays().getDate());
//        publicHolidaysModel.setDescription(employe.getPublicHolidays().getDescription());
//        publicHolidaysModel.setHolidayFinancialYear(employe.getPublicHolidays().getHolidayFinancialYear());

        List<EmployeeHolidaysModel> employeeHolidaysModelList = new ArrayList<>();
        employe.getEmployeeHolidays().forEach(e -> {
            EmployeeHolidaysModel employeeHolidaysModel = new EmployeeHolidaysModel();
            employeeHolidaysModel.setId(e.getId());
            employeeHolidaysModel.setFromDate(e.getFromDate());
            employeeHolidaysModel.setToDate(e.getToDate());
            employeeHolidaysModel.setHalfDay(e.getHalfDay());
            employeeHolidaysModel.setDescription(e.getDescription());
            employeeHolidaysModelList.add(employeeHolidaysModel);
        });

        employeModel.setEmployeeId(employe.getEmployeeId());
        employeModel.setName(employe.getName());
        employeModel.setEmail(employe.getEmail());
        employeModel.setPhoneNo(employe.getPhoneNo());
        employeModel.setDesignation(employe.getDesignation());
        employeModel.setSalary(employe.getSalary());
        employeModel.setAddressLine1(employe.getAddressLine1());
        employeModel.setCity(employe.getCity());
        employeModel.setEmployeeHolidaysModels(employeeHolidaysModelList);
//        employeModel.setPublicHolidaysModel(publicHolidaysModel);
//        employeModel.setOnSiteWorkingDataModel(getCompanyData);

        return employeModel;
    }

    public EmployeModel getEmployeById(Integer id){
       Optional<Employe> employe = employeRepository.findById(id);
       if (employe.isPresent()){
           return getEmployeModel(employe.get());
       }    return null;
    }
    public List<EmployeModel> getEmployes(){
        List<Employe> employes = employeRepository.findAll();
    return employes.stream().map(e -> getEmployeModel(e)).collect(Collectors.toList());
    }
//   <--------------------------------Getting Only Public Holidays--------------------------------------------->
    public PublicHolidays addPublicHolidays(PublicHolidaysModel publicHolidaysModel){

        PublicHolidays publicHolidays = new PublicHolidays();
//        ph.setId(publicHolidaysModel.getId());
        publicHolidays.setDate(publicHolidaysModel.getDate());
        publicHolidays.setDescription(publicHolidaysModel.getDescription());
        publicHolidays.setHolidayFinancialYear(publicHolidaysModel.getHolidayFinancialYear());

        return publicHolidayRepository.save(publicHolidays);
    }
//   <------------------Converting PublicHolidaysModel into entity -------------------->
    public PublicHolidaysModel getPublicHolidaysModel(PublicHolidays publicHolidays){

        PublicHolidaysModel publicHolidaysModel = new PublicHolidaysModel();
        publicHolidaysModel.setId(publicHolidays.getId());
        publicHolidaysModel.setDate(publicHolidays.getDate());
        publicHolidaysModel.setDescription(publicHolidays.getDescription());
        publicHolidaysModel.setHolidayFinancialYear(publicHolidays.getHolidayFinancialYear());

        return publicHolidaysModel;
    }

    public List<PublicHolidaysModel> getPublicHoliday(){
       List<PublicHolidays> holidays = publicHolidayRepository.findAll();
       return holidays.stream().map(holiday -> getPublicHolidaysModel(holiday)).collect(Collectors.toList());
    }

// <---------------------------------Getting Only OnSiteWorkingData----------------------------------------->

    public OnSiteWorkingData addOnSiteWorkingData(OnSiteWorkingDataModel onSiteWorkingDataModel){

        OnSiteWorkingData onSiteWorkingData = new OnSiteWorkingData();
        onSiteWorkingData.setId(onSiteWorkingDataModel.getId());
        onSiteWorkingData.setWorkingHours(onSiteWorkingDataModel.getWorkingHours());
        onSiteWorkingData.setNoOfHolidays(onSiteWorkingDataModel.getNoOfHolidays());

        return onSiteWorkingDataRepository.save(onSiteWorkingData);
    }
    public OnSiteWorkingDataModel getOnSiteWorkingDataModel(OnSiteWorkingData onSiteWorkingData){

        OnSiteWorkingDataModel onSiteWorkingDataModel = new OnSiteWorkingDataModel();
        onSiteWorkingDataModel.setId(onSiteWorkingData.getId());
        onSiteWorkingDataModel.setWorkingHours(onSiteWorkingData.getWorkingHours());
        onSiteWorkingDataModel.setNoOfHolidays(onSiteWorkingData.getNoOfHolidays());

        return onSiteWorkingDataModel;
    }
    public List<OnSiteWorkingDataModel> getCompanyData(){
        List<OnSiteWorkingData> companyData = onSiteWorkingDataRepository.findAll();
        return companyData.stream().map(c -> getOnSiteWorkingDataModel(c)).collect(Collectors.toList());
    }



//  <----------------------------------------------------------------------------------------------------------->

//    public EmployeModel convertion(Employe emp){
//
//        Employe employe = new Employe();
//        OnSiteWorkingData onSiteWorkingData = new OnSiteWorkingData();
//        PublicHolidays publicHolidays = new PublicHolidays();
//        EmployeModel employeModel = new EmployeModel();
//
//        OnSiteWorkingDataModel onSiteWorkingDataModel = new OnSiteWorkingDataModel();
//        onSiteWorkingDataModel.setId(onSiteWorkingData.getId());
//        onSiteWorkingDataModel.setWorkingHours(onSiteWorkingData.getWorkingHours());
//        onSiteWorkingDataModel.setNoOfHolidays(onSiteWorkingData.getNoOfHolidays());
//
//        PublicHolidaysModel publicHolidaysModel = new PublicHolidaysModel();
//        publicHolidaysModel.setId(publicHolidays.getId());
//        publicHolidaysModel.setDate(publicHolidays.getDate());
//        publicHolidaysModel.setDescription(publicHolidays.getDescription());
//        publicHolidaysModel.setHolidayFinancialYear(publicHolidays.getHolidayFinancialYear());
//
//        List<EmployeeHolidaysModel> employeeHolidaysModelList = new ArrayList<>();
//        employe.getEmployeeHolidays().forEach(e -> {
//            EmployeeHolidaysModel employeeHolidaysModel = new EmployeeHolidaysModel();
////            employeeHolidaysModel.setHolidayId(e.getEmployeeId());
//            employeeHolidaysModel.setFromDate(e.getFromDate());
//            employeeHolidaysModel.setToDate(e.getToDate());
//            employeeHolidaysModel.setHalfDay(e.getHalfDay());
//            employeeHolidaysModel.setDescription(e.getDescription());
//            employeeHolidaysModelList.add(employeeHolidaysModel);
//        });
//
//        employeModel.setEmployeeId(emp.getEmployeeId());
//        employeModel.setName(emp.getName());
//        employeModel.setEmail(emp.getEmail());
//        employeModel.setPhoneNo(emp.getPhoneNo());
//        employeModel.setDesignation(emp.getDesignation());
//        employeModel.setSalary(emp.getSalary());
//        employeModel.setAddressLine1(emp.getAddressLine1());
//        employeModel.setCity(emp.getCity());
//        employeModel.setOnSiteWorkingDataModel(onSiteWorkingDataModel);
//        employeModel.setPublicHolidaysModel(publicHolidaysModel);
//        employeModel.setEmployeeHolidaysModels(employeeHolidaysModelList);
//
//
//        return employeModel;
//    }

}
