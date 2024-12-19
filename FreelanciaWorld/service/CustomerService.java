package com.freelanciaApp.FreelanciaWorld.service;
import com.freelanciaApp.FreelanciaWorld.model.Customer;
import com.freelanciaApp.FreelanciaWorld.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Tüm müşterileri getir
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // ID'ye göre müşteri getir
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    // Müşteri kaydet veya güncelle
    public Customer saveOrUpdateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Müşteri sil
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }


}
