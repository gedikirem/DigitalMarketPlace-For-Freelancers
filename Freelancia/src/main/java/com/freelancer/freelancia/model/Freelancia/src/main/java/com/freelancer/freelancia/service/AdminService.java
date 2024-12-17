package com.freelancer.freelancia.service;

import org.springframework.stereotype.Service;
import com.freelancer.freelancia.model.Admin;
import com.freelancer.freelancia.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    // Tüm adminleri getir
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // ID'ye göre admin getir
    public Optional<Admin> getAdminById(Long id) {
        return adminRepository.findById(id);
    }

    // Admin kaydet veya güncelle
    public Admin saveOrUpdateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Admin sil
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    // Admin'e özel işlemler
    public Admin getAdminInstance() {
        return Admin.getInstance();
    }
}
