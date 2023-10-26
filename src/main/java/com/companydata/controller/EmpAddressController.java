package com.companydata.controller;


import com.companydata.entities.EmpAddress;
import com.companydata.service.EmpAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empAdress")
@CrossOrigin("*")
public class EmpAddressController {

    @Autowired
    private EmpAddressService empAddressService;
    @PostMapping("/saveAddress")
    public EmpAddress addressSave(@RequestBody EmpAddress addressData ){

        System.out.println("Emp Name ::  "+ addressData.getEmployeeRecord().getName());
        System.out.println("I am a address Controller !! ");
        return empAddressService.saveAddress(addressData);

    }



}
