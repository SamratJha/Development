package com.example;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by USER on 7/16/2016.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByFirstName(String firstName);
    Customer findByLastName(String lastName);
}
