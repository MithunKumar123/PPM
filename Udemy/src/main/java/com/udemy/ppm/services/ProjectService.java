package com.udemy.ppm.services;

import com.udemy.ppm.domain.Project;
import com.udemy.ppm.repositories.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepo;


    public Project saveOrUpdateProject(Project project){
        return projectRepo.save(project);
    }

}
