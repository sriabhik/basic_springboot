package com.companydata.controller;


import com.companydata.entities.Project;
import com.companydata.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
@CrossOrigin("*")
public class ProjectController {

    @Autowired
    private ProjectService projectService;
    @PostMapping("/create")
    public Project createProject(@RequestBody Project project){
        return this.projectService.addProject(project);
    }
}
