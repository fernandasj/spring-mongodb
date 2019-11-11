package com.example.demo.repository;

import com.example.demo.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    public Customer findByFirstName(String name);
    public List<Customer> findByLastName(String name);
}
