package com.ecom.ecom.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecom.entites.Client;
@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
    
}
