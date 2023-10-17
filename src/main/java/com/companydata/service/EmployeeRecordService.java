package com.companydata.service;


import com.companydata.entities.EmpAddress;
import com.companydata.entities.EmployeeRecord;
import com.companydata.repositories.EmployeeRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeRecordService {


    //to save the record into databse

    //get the details

    @Autowired
    private EmployeeRecordRepo employeeRecordRepo;

    public EmployeeRecord saveEmployee(EmployeeRecord employeeRecord){

         EmployeeRecord saveData = new EmployeeRecord();
         saveData.setName(employeeRecord.getName());
         saveData.setAge(employeeRecord.getAge());

         saveData.setEmpAddress(employeeRecord.getEmpAddress());

         return employeeRecordRepo.save(saveData);
    }
//fetch the record

    public EmployeeRecord getByEmpId(int id ){
            System.out.println("I am service");
            return this.employeeRecordRepo.findById(id).get();
    }




    // get ALl employee
    public List<EmployeeRecord> allEmpRecord(){
          List<EmployeeRecord>  employeeRecordList =this.employeeRecordRepo.findAll();
          return employeeRecordList;
    }


}


