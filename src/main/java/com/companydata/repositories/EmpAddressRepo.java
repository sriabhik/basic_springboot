package com.companydata.repositories;

import com.companydata.entities.EmpAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpAddressRepo extends JpaRepository<EmpAddress,Integer> {
}
