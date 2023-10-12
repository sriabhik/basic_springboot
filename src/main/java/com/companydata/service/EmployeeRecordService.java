package com.companydata.service;


import com.companydata.entities.EmployeeRecord;
import com.companydata.repositories.EmployeeRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
         return employeeRecordRepo.save(saveData);
    }
//fetch the record

    public EmployeeRecord getByEmpId(int id ){
            return this.employeeRecordRepo.findById(id).get();
    }

}


