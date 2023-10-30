package com.companydata.service;

import com.companydata.entities.Employee;
import com.companydata.entities.Project;
import com.companydata.repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;
    public Project addProject(Project savedData){

        Project sD = new Project();
        sD.setProjectName(savedData.getProjectName());


        List<Employee> employeeList = new ArrayList<>();
        for(Employee e : savedData.getEmployee()){
            Employee saveEmp = new Employee();
            saveEmp.setEmpName(e.getEmpName());
            //saveEmp.setProject(projectList);
            employeeList.add(saveEmp);
        }
        sD.setEmployee(employeeList);
        return this.projectRepo.save(sD);

    }


}
