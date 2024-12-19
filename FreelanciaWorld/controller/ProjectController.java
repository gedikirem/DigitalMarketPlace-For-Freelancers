package com.freelanciaApp.FreelanciaWorld.controller;
import org.springframework.transaction.annotation.Transactional;
import ch.qos.logback.core.model.Model;
import com.freelanciaApp.FreelanciaWorld.model.Project;
import com.freelanciaApp.FreelanciaWorld.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/projects")
public class ProjectController {
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // Tüm projelerigetir
    @Transactional
    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    // ID'ye göre proje getir
    @GetMapping("/{id}")
    public Optional<Project> getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    // Yeni proje oluştur
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectService.saveOrUpdateProject(project);
    }

    // Projeyi sil
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }



}
