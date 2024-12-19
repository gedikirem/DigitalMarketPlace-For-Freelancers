package com.freelanciaApp.FreelanciaWorld.controller;


import com.freelanciaApp.FreelanciaWorld.model.Customer;
import com.freelanciaApp.FreelanciaWorld.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Tüm müşterileri getir
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // ID'ye göre müşteri getir
    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    // Yeni müşteri oluştur
    @PostMapping
    public Customer saveOrUpdateCustomer(@RequestBody Customer customer) {
        return customerService.saveOrUpdateCustomer(customer);
    }



    // Müşteriyi sil
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }
}