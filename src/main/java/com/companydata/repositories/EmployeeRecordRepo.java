package com.companydata.repositories;


import com.companydata.entities.EmployeeRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRecordRepo extends JpaRepository<EmployeeRecord,Integer> {
}
