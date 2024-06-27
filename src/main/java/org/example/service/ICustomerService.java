package org.example.service;

import org.example.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> selectAll();

    Customer findById(int id);

    void updateCustomer(Customer customer);
}
