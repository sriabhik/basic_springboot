package com.companydata.controller;


import com.companydata.entities.EmployeeRecord;
import com.companydata.service.EmployeeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeRecordController {

    @Autowired
    private EmployeeRecordService employeeRecordService;

    @PostMapping("/register")
    public EmployeeRecord createEmployee(@RequestBody EmployeeRecord employeeRecord){
           return this.employeeRecordService.saveEmployee(employeeRecord);
    }


    @GetMapping("/getById/{id}")
    public EmployeeRecord getByEmpid(@PathVariable Integer id){
        return this.employeeRecordService.getByEmpId(id);
    }

    @GetMapping("/getAllemployee")
    public List<EmployeeRecord> employeeRecordList(){
        return this.employeeRecordService.allEmpRecord();
    }

}
