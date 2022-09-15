package com.udemy.ppm.controller;


import com.udemy.ppm.domain.Project;
import com.udemy.ppm.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;


    @PostMapping("/save")
    public ResponseEntity<Project> saveOrUpdateProject(@RequestBody Project project){
        return new ResponseEntity<Project>(projectService.saveOrUpdateProject(project), HttpStatus.OK);
    }

}
