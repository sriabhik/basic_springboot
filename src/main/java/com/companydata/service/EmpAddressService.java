package com.companydata.service;

import com.companydata.entities.EmpAddress;
import com.companydata.repositories.EmpAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpAddressService {


    @Autowired
    private EmpAddressRepo empAddressRepo;




    public EmpAddress getByAddressId(int addressId){
       return  this.empAddressRepo.findById(addressId).get();

    }



}
