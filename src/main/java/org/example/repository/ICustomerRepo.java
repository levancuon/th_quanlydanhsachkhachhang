package org.example.repository;

import org.example.model.Customer;

import java.util.List;

public interface ICustomerRepo {
    List<Customer> sellectAll();

    Customer findById(int id);

    void updateCustomer(Customer customer);
}
