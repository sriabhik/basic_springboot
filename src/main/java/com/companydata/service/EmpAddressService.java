package com.companydata.service;

import com.companydata.entities.EmpAddress;
import com.companydata.entities.EmployeeRecord;
import com.companydata.repositories.EmpAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpAddressService {


    @Autowired
    private EmpAddressRepo empAddressRepo;

     //save address into database
        public EmpAddress  saveAddress(EmpAddress empAddress){



            System.out.println("I am a address Service");
            System.out.println("Emp Name ::  "+ empAddress.getEmployeeRecord().getName());

             EmpAddress saveData = new EmpAddress();
             saveData.setLocation(empAddress.getLocation());

             EmployeeRecord newRecord = new EmployeeRecord();
             newRecord.setName(empAddress.getEmployeeRecord().getName());
             newRecord.setAge(empAddress.getEmployeeRecord().getAge());
             newRecord.setEmpAddress(saveData);
             saveData.setEmployeeRecord(newRecord);

             return this.empAddressRepo.save(saveData);

        }

}
