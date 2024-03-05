package com.ecom.ecom.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecom.ecom.entites.Client;

public interface ClientRepository extends MongoRepository<Client, String> {
    
}
