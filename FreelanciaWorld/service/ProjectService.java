package com.freelanciaApp.FreelanciaWorld.service;

import com.freelanciaApp.FreelanciaWorld.model.Project;
import com.freelanciaApp.FreelanciaWorld.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    // Tüm projeleri getir
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // ID'ye göre proje getir
    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    // Müşteri ID'sine göre projeleri getir
    public List<Project> getProjectsByCustomerId(Long customerId) {
        return projectRepository.findByCustomerId(customerId);
    }

    // Projeyi kaydet veya güncelle
    public Project saveOrUpdateProject(Project project) {
        return projectRepository.save(project);
    }

    // Projeyi sil
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }


}
