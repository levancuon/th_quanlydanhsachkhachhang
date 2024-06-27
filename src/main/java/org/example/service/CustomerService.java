package org.example.service;

import org.example.model.Customer;
import org.example.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    CustomerRepo customerRepo = new CustomerRepo();

    @Override
    public List<Customer> selectAll() {
        return customerRepo.sellectAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepo.findById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepo.updateCustomer(customer);
    }
}
