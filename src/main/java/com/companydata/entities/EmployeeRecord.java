package com.companydata.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_data")
public class EmployeeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="empId")
    private int id;

    @Column(name = "empName")
    private String name;

    @Column(name = "empAge")
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_addressId",referencedColumnName = "addressId")
    private EmpAddress empAddress;


}
