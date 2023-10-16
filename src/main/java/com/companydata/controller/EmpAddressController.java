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

    //save address

    

    @GetMapping("/getByAddressId/{addressId}")

    public EmpAddress  getByAddressId(@PathVariable Integer addressId){
        return this.empAddressService.getByAddressId(addressId);
    }
}
