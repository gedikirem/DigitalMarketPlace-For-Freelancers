package com.freelanciaApp.FreelanciaWorld.repository;

import com.freelanciaApp.FreelanciaWorld.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    //Belirli bir kullanıcıya ait projeleri bulma:
    List<Project> findByCustomerId(Long customerId);
    //Başlıkla arama yapmak:
    List<Project> findByTitleContaining(String title);
    // Bütçesi belirli bir değerin üzerinde olan projeleri getirmek
    List<Project> findByBudgetGreaterThan(double budget);

}

