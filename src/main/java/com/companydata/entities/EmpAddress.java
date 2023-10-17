package com.companydata.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_address")
public class EmpAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;

    private String location;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "empAddress")
    private EmployeeRecord employeeRecord;
}
